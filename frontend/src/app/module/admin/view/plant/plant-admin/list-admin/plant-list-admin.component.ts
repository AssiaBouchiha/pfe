import {Component, OnInit} from '@angular/core';
import {PlantService} from 'src/app/controller/service/Plant.service';
import {PlantDto} from 'src/app/controller/model/Plant.model';
import {PlantCriteria} from 'src/app/controller/criteria/PlantCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { GenderService } from 'src/app/controller/service/Gender.service';
import { AgeCategoryService } from 'src/app/controller/service/AgeCategory.service';

import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {GenderDto} from 'src/app/controller/model/Gender.model';


@Component({
  selector: 'app-plant-list-admin',
  templateUrl: './plant-list-admin.component.html'
})
export class PlantListAdminComponent extends AbstractListController<PlantDto, PlantCriteria, PlantService>  implements OnInit {

    fileName = 'Plant';

    genders :Array<GenderDto>;
    ageCategorys :Array<AgeCategoryDto>;
  
    constructor(plantService: PlantService, private genderService: GenderService, private ageCategoryService: AgeCategoryService) {
        super(plantService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadGender();
      this.loadAgeCategory();
    }

    public async loadPlants(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Plant', 'list');
        isPermistted ? this.service.findAll().subscribe(plants => this.items = plants,error=>console.log(error))
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
        ];
    }


    public async loadGender(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Plant', 'list');
        isPermistted ? this.genderService.findAllOptimized().subscribe(genders => this.genders = genders,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAgeCategory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Plant', 'list');
        isPermistted ? this.ageCategoryService.findAllOptimized().subscribe(ageCategorys => this.ageCategorys = ageCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: PlantDto) {
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
        }];
      }
}
