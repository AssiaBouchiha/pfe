import {Component, OnInit} from '@angular/core';
import {FoodService} from 'src/app/controller/service/Food.service';
import {FoodDto} from 'src/app/controller/model/Food.model';
import {FoodCriteria} from 'src/app/controller/criteria/FoodCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { AnimalSpecieService } from 'src/app/controller/service/AnimalSpecie.service';
import { MarketCategoryService } from 'src/app/controller/service/MarketCategory.service';
import { BrandService } from 'src/app/controller/service/Brand.service';

import {BrandDto} from 'src/app/controller/model/Brand.model';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';


@Component({
  selector: 'app-food-list-admin',
  templateUrl: './food-list-admin.component.html'
})
export class FoodListAdminComponent extends AbstractListController<FoodDto, FoodCriteria, FoodService>  implements OnInit {

    fileName = 'Food';

    animalSpecies :Array<AnimalSpecieDto>;
    marketCategorys :Array<MarketCategoryDto>;
    brands :Array<BrandDto>;
  
    constructor(foodService: FoodService, private animalSpecieService: AnimalSpecieService, private marketCategoryService: MarketCategoryService, private brandService: BrandService) {
        super(foodService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadAnimalSpecie();
      this.loadMarketCategory();
      this.loadBrand();
    }

    public async loadFoods(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Food', 'list');
        isPermistted ? this.service.findAll().subscribe(foods => this.items = foods,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'animalSpecie?.libelle', header: 'Animal specie'},
            {field: 'libelle', header: 'Libelle'},
            {field: 'marketCategory?.libelle', header: 'Market category'},
            {field: 'brand?.libelle', header: 'Brand'},
        ];
    }


    public async loadAnimalSpecie(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Food', 'list');
        isPermistted ? this.animalSpecieService.findAllOptimized().subscribe(animalSpecies => this.animalSpecies = animalSpecies,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadMarketCategory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Food', 'list');
        isPermistted ? this.marketCategoryService.findAllOptimized().subscribe(marketCategorys => this.marketCategorys = marketCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadBrand(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Food', 'list');
        isPermistted ? this.brandService.findAllOptimized().subscribe(brands => this.brands = brands,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: FoodDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Animal specie': e.animalSpecie?.libelle ,
                 'Libelle': e.libelle ,
                'Market category': e.marketCategory?.libelle ,
                'Brand': e.brand?.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        //'Animal specie': this.criteria.animalSpecie?.libelle ? this.criteria.animalSpecie?.libelle : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        //'Market category': this.criteria.marketCategory?.libelle ? this.criteria.marketCategory?.libelle : environment.emptyForExport ,
        //'Brand': this.criteria.brand?.libelle ? this.criteria.brand?.libelle : environment.emptyForExport ,
        }];
      }
}
