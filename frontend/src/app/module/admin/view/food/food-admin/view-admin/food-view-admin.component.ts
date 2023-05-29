import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {FoodService} from 'src/app/controller/service/Food.service';
import {FoodDto} from 'src/app/controller/model/Food.model';
import {FoodCriteria} from 'src/app/controller/criteria/FoodCriteria.model';

import {BrandDto} from 'src/app/controller/model/Brand.model';
import {BrandService} from 'src/app/controller/service/Brand.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
@Component({
  selector: 'app-food-view-admin',
  templateUrl: './food-view-admin.component.html'
})
export class FoodViewAdminComponent extends AbstractViewController<FoodDto, FoodCriteria, FoodService> implements OnInit {


    constructor(private foodService: FoodService, private brandService: BrandService, private marketCategoryService: MarketCategoryService, private animalSpecieService: AnimalSpecieService){
        super(foodService);
    }

    ngOnInit(): void {
        this.animalSpecie = new AnimalSpecieDto();
        this.animalSpecieService.findAll().subscribe((data) => this.animalSpecies = data);
        this.marketCategory = new MarketCategoryDto();
        this.marketCategoryService.findAll().subscribe((data) => this.marketCategorys = data);
        this.brand = new BrandDto();
        this.brandService.findAll().subscribe((data) => this.brands = data);
    }


    get brand(): BrandDto {
       return this.brandService.item;
    }
    set brand(value: BrandDto) {
        this.brandService.item = value;
    }
    get brands():Array<BrandDto> {
       return this.brandService.items;
    }
    set brands(value: Array<BrandDto>) {
        this.brandService.items = value;
    }
    get animalSpecie(): AnimalSpecieDto {
       return this.animalSpecieService.item;
    }
    set animalSpecie(value: AnimalSpecieDto) {
        this.animalSpecieService.item = value;
    }
    get animalSpecies():Array<AnimalSpecieDto> {
       return this.animalSpecieService.items;
    }
    set animalSpecies(value: Array<AnimalSpecieDto>) {
        this.animalSpecieService.items = value;
    }
    get marketCategory(): MarketCategoryDto {
       return this.marketCategoryService.item;
    }
    set marketCategory(value: MarketCategoryDto) {
        this.marketCategoryService.item = value;
    }
    get marketCategorys():Array<MarketCategoryDto> {
       return this.marketCategoryService.items;
    }
    set marketCategorys(value: Array<MarketCategoryDto>) {
        this.marketCategoryService.items = value;
    }


}
