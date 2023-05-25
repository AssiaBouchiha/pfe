import {Component, OnInit} from '@angular/core';
import {LocationDataService} from 'src/app/controller/service/LocationData.service';
import {LocationDataDto} from 'src/app/controller/model/LocationData.model';
import {LocationDataCriteria} from 'src/app/controller/criteria/LocationDataCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { InstitutionService } from 'src/app/controller/service/Institution.service';
import { DepartmentService } from 'src/app/controller/service/Department.service';
import { LocationTypeService } from 'src/app/controller/service/LocationType.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';

import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';


@Component({
  selector: 'app-location-data-list-admin',
  templateUrl: './location-data-list-admin.component.html'
})
export class LocationDataListAdminComponent extends AbstractListController<LocationDataDto, LocationDataCriteria, LocationDataService>  implements OnInit {

    fileName = 'LocationData';

    institutions :Array<InstitutionDto>;
    departments :Array<DepartmentDto>;
    locationTypes :Array<LocationTypeDto>;
    dataImportExports :Array<DataImportExportDto>;
  
    constructor(locationDataService: LocationDataService, private institutionService: InstitutionService, private departmentService: DepartmentService, private locationTypeService: LocationTypeService, private dataImportExportService: DataImportExportService) {
        super(locationDataService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadInstitution();
      this.loadDepartment();
      this.loadLocationType();
      this.loadDataImportExport();
    }

    public async loadLocationDatas(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationData', 'list');
        isPermistted ? this.service.findAll().subscribe(locationDatas => this.items = locationDatas,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'dateOfAdmission', header: 'Date of admission'},
            {field: 'location', header: 'Location'},
            {field: 'institution?.libelle', header: 'Institution'},
            {field: 'department?.libelle', header: 'Department'},
            {field: 'locationType?.libelle', header: 'Location type'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
        ];
    }


    public async loadInstitution(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationData', 'list');
        isPermistted ? this.institutionService.findAllOptimized().subscribe(institutions => this.institutions = institutions,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDepartment(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationData', 'list');
        isPermistted ? this.departmentService.findAllOptimized().subscribe(departments => this.departments = departments,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadLocationType(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationData', 'list');
        isPermistted ? this.locationTypeService.findAllOptimized().subscribe(locationTypes => this.locationTypes = locationTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationData', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: LocationDataDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Date of admission': this.datePipe.transform(e.dateOfAdmission , 'dd/MM/yyyy hh:mm'),
                 'Location': e.location ,
                'Institution': e.institution?.libelle ,
                'Department': e.department?.libelle ,
                'Location type': e.locationType?.libelle ,
                'Data import export': e.dataImportExport?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Date of admission Min': this.criteria.dateOfAdmissionFrom ? this.datePipe.transform(this.criteria.dateOfAdmissionFrom , this.dateFormat) : environment.emptyForExport ,
            'Date of admission Max': this.criteria.dateOfAdmissionTo ? this.datePipe.transform(this.criteria.dateOfAdmissionTo , this.dateFormat) : environment.emptyForExport ,
            'Location': this.criteria.location ? this.criteria.location : environment.emptyForExport ,
        //'Institution': this.criteria.institution?.libelle ? this.criteria.institution?.libelle : environment.emptyForExport ,
        //'Department': this.criteria.department?.libelle ? this.criteria.department?.libelle : environment.emptyForExport ,
        //'Location type': this.criteria.locationType?.libelle ? this.criteria.locationType?.libelle : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        }];
      }
}
