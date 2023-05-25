import {Component, OnInit} from '@angular/core';
import {PatientService} from 'src/app/controller/service/Patient.service';
import {PatientDto} from 'src/app/controller/model/Patient.model';
import {PatientCriteria} from 'src/app/controller/criteria/PatientCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { GenderService } from 'src/app/controller/service/Gender.service';
import { AgeCategoryService } from 'src/app/controller/service/AgeCategory.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {GenderDto} from 'src/app/controller/model/Gender.model';


@Component({
  selector: 'app-patient-list-admin',
  templateUrl: './patient-list-admin.component.html'
})
export class PatientListAdminComponent extends AbstractListController<PatientDto, PatientCriteria, PatientService>  implements OnInit {

    fileName = 'Patient';

    genders :Array<GenderDto>;
    ageCategorys :Array<AgeCategoryDto>;
    dataImportExports :Array<DataImportExportDto>;
  
    constructor(patientService: PatientService, private genderService: GenderService, private ageCategoryService: AgeCategoryService, private dataImportExportService: DataImportExportService) {
        super(patientService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadGender();
      this.loadAgeCategory();
      this.loadDataImportExport();
    }

    public async loadPatients(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Patient', 'list');
        isPermistted ? this.service.findAll().subscribe(patients => this.items = patients,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'lastname', header: 'Lastname'},
            {field: 'firstname', header: 'Firstname'},
            {field: 'gender?.libelle', header: 'Gender'},
            {field: 'dateofbirth', header: 'Dateofbirth'},
            {field: 'age', header: 'Age'},
            {field: 'ageCategory?.libelle', header: 'Age category'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
        ];
    }


    public async loadGender(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Patient', 'list');
        isPermistted ? this.genderService.findAllOptimized().subscribe(genders => this.genders = genders,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAgeCategory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Patient', 'list');
        isPermistted ? this.ageCategoryService.findAllOptimized().subscribe(ageCategorys => this.ageCategorys = ageCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Patient', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: PatientDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Lastname': e.lastname ,
                 'Firstname': e.firstname ,
                'Gender': e.gender?.libelle ,
                'Dateofbirth': this.datePipe.transform(e.dateofbirth , 'dd/MM/yyyy hh:mm'),
                 'Age': e.age ,
                'Age category': e.ageCategory?.libelle ,
                'Data import export': e.dataImportExport?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Lastname': this.criteria.lastname ? this.criteria.lastname : environment.emptyForExport ,
            'Firstname': this.criteria.firstname ? this.criteria.firstname : environment.emptyForExport ,
        //'Gender': this.criteria.gender?.libelle ? this.criteria.gender?.libelle : environment.emptyForExport ,
            'Dateofbirth Min': this.criteria.dateofbirthFrom ? this.datePipe.transform(this.criteria.dateofbirthFrom , this.dateFormat) : environment.emptyForExport ,
            'Dateofbirth Max': this.criteria.dateofbirthTo ? this.datePipe.transform(this.criteria.dateofbirthTo , this.dateFormat) : environment.emptyForExport ,
            'Age': this.criteria.age ? this.criteria.age : environment.emptyForExport ,
        //'Age category': this.criteria.ageCategory?.libelle ? this.criteria.ageCategory?.libelle : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        }];
      }
}
