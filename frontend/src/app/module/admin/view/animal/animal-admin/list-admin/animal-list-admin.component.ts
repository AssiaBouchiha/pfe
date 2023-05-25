import {Component, OnInit} from '@angular/core';
import {AnimalService} from 'src/app/controller/service/Animal.service';
import {AnimalDto} from 'src/app/controller/model/Animal.model';
import {AnimalCriteria} from 'src/app/controller/criteria/AnimalCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { GenderService } from 'src/app/controller/service/Gender.service';
import { AgeCategoryService } from 'src/app/controller/service/AgeCategory.service';
import { AnimalSpecieService } from 'src/app/controller/service/AnimalSpecie.service';
import { AnimalTypeService } from 'src/app/controller/service/AnimalType.service';
import { MarketCategoryService } from 'src/app/controller/service/MarketCategory.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalTypeDto} from 'src/app/controller/model/AnimalType.model';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {GenderDto} from 'src/app/controller/model/Gender.model';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';


@Component({
  selector: 'app-animal-list-admin',
  templateUrl: './animal-list-admin.component.html'
})
export class AnimalListAdminComponent extends AbstractListController<AnimalDto, AnimalCriteria, AnimalService>  implements OnInit {

    fileName = 'Animal';

    genders :Array<GenderDto>;
    ageCategorys :Array<AgeCategoryDto>;
    animalSpecies :Array<AnimalSpecieDto>;
    animalTypes :Array<AnimalTypeDto>;
    marketCategorys :Array<MarketCategoryDto>;
    dataImportExports :Array<DataImportExportDto>;
  
    constructor(animalService: AnimalService, private genderService: GenderService, private ageCategoryService: AgeCategoryService, private animalSpecieService: AnimalSpecieService, private animalTypeService: AnimalTypeService, private marketCategoryService: MarketCategoryService, private dataImportExportService: DataImportExportService) {
        super(animalService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadGender();
      this.loadAgeCategory();
      this.loadAnimalSpecie();
      this.loadAnimalType();
      this.loadMarketCategory();
      this.loadDataImportExport();
    }

    public async loadAnimals(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.service.findAll().subscribe(animals => this.items = animals,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'name', header: 'Name'},
            {field: 'gender?.libelle', header: 'Gender'},
            {field: 'age', header: 'Age'},
            {field: 'ageCategory?.libelle', header: 'Age category'},
            {field: 'animalSpecie?.libelle', header: 'Animal specie'},
            {field: 'animalType?.libelle', header: 'Animal type'},
            {field: 'marketCategory?.libelle', header: 'Market category'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
        ];
    }


    public async loadGender(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.genderService.findAllOptimized().subscribe(genders => this.genders = genders,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAgeCategory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.ageCategoryService.findAllOptimized().subscribe(ageCategorys => this.ageCategorys = ageCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAnimalSpecie(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.animalSpecieService.findAllOptimized().subscribe(animalSpecies => this.animalSpecies = animalSpecies,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAnimalType(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.animalTypeService.findAllOptimized().subscribe(animalTypes => this.animalTypes = animalTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadMarketCategory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.marketCategoryService.findAllOptimized().subscribe(marketCategorys => this.marketCategorys = marketCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Animal', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: AnimalDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Name': e.name ,
                'Gender': e.gender?.libelle ,
                 'Age': e.age ,
                'Age category': e.ageCategory?.libelle ,
                'Animal specie': e.animalSpecie?.libelle ,
                'Animal type': e.animalType?.libelle ,
                'Market category': e.marketCategory?.libelle ,
                'Data import export': e.dataImportExport?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Name': this.criteria.name ? this.criteria.name : environment.emptyForExport ,
        //'Gender': this.criteria.gender?.libelle ? this.criteria.gender?.libelle : environment.emptyForExport ,
            'Age': this.criteria.age ? this.criteria.age : environment.emptyForExport ,
        //'Age category': this.criteria.ageCategory?.libelle ? this.criteria.ageCategory?.libelle : environment.emptyForExport ,
        //'Animal specie': this.criteria.animalSpecie?.libelle ? this.criteria.animalSpecie?.libelle : environment.emptyForExport ,
        //'Animal type': this.criteria.animalType?.libelle ? this.criteria.animalType?.libelle : environment.emptyForExport ,
        //'Market category': this.criteria.marketCategory?.libelle ? this.criteria.marketCategory?.libelle : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        }];
      }
}
