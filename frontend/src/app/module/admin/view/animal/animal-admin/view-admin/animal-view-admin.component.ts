import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AnimalService} from 'src/app/controller/service/Animal.service';
import {AnimalDto} from 'src/app/controller/model/Animal.model';
import {AnimalCriteria} from 'src/app/controller/criteria/AnimalCriteria.model';

import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderService} from 'src/app/controller/service/Gender.service';
import {AnimalTypeDto} from 'src/app/controller/model/AnimalType.model';
import {AnimalTypeService} from 'src/app/controller/service/AnimalType.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
@Component({
  selector: 'app-animal-view-admin',
  templateUrl: './animal-view-admin.component.html'
})
export class AnimalViewAdminComponent extends AbstractViewController<AnimalDto, AnimalCriteria, AnimalService> implements OnInit {


    constructor(private animalService: AnimalService, private genderService: GenderService, private animalTypeService: AnimalTypeService, private marketCategoryService: MarketCategoryService, private animalSpecieService: AnimalSpecieService, private ageCategoryService: AgeCategoryService){
        super(animalService);
    }

    ngOnInit(): void {
        this.gender = new GenderDto();
        this.genderService.findAll().subscribe((data) => this.genders = data);
        this.ageCategory = new AgeCategoryDto();
        this.ageCategoryService.findAll().subscribe((data) => this.ageCategorys = data);
        this.animalSpecie = new AnimalSpecieDto();
        this.animalSpecieService.findAll().subscribe((data) => this.animalSpecies = data);
        this.animalType = new AnimalTypeDto();
        this.animalTypeService.findAll().subscribe((data) => this.animalTypes = data);
        this.marketCategory = new MarketCategoryDto();
        this.marketCategoryService.findAll().subscribe((data) => this.marketCategorys = data);
    }


    get gender(): GenderDto {
       return this.genderService.item;
    }
    set gender(value: GenderDto) {
        this.genderService.item = value;
    }
    get genders():Array<GenderDto> {
       return this.genderService.items;
    }
    set genders(value: Array<GenderDto>) {
        this.genderService.items = value;
    }
    get animalType(): AnimalTypeDto {
       return this.animalTypeService.item;
    }
    set animalType(value: AnimalTypeDto) {
        this.animalTypeService.item = value;
    }
    get animalTypes():Array<AnimalTypeDto> {
       return this.animalTypeService.items;
    }
    set animalTypes(value: Array<AnimalTypeDto>) {
        this.animalTypeService.items = value;
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
    get ageCategory(): AgeCategoryDto {
       return this.ageCategoryService.item;
    }
    set ageCategory(value: AgeCategoryDto) {
        this.ageCategoryService.item = value;
    }
    get ageCategorys():Array<AgeCategoryDto> {
       return this.ageCategoryService.items;
    }
    set ageCategorys(value: Array<AgeCategoryDto>) {
        this.ageCategoryService.items = value;
    }


}
