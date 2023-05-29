import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

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
  selector: 'app-animal-edit-admin',
  templateUrl: './animal-edit-admin.component.html'
})
export class AnimalEditAdminComponent extends AbstractEditController<AnimalDto, AnimalCriteria, AnimalService>   implements OnInit {


    private _validAnimalCode = true;
    private _validAnimalName = true;

    private _validGenderCode = true;
    private _validGenderLibelle = true;
    private _validAgeCategoryCode = true;
    private _validAgeCategoryLibelle = true;
    private _validAnimalSpecieCode = true;
    private _validAnimalSpecieLibelle = true;
    private _validAnimalTypeCode = true;
    private _validAnimalTypeLibelle = true;
    private _validMarketCategoryCode = true;
    private _validMarketCategoryLibelle = true;



    constructor( private animalService: AnimalService , private genderService: GenderService, private animalTypeService: AnimalTypeService, private marketCategoryService: MarketCategoryService, private animalSpecieService: AnimalSpecieService, private ageCategoryService: AgeCategoryService) {
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


    public setValidation(value : boolean){
        this.validAnimalCode = value;
        this.validAnimalName = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAnimalCode();
        this.validateAnimalName();
    }
    public validateAnimalCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validAnimalCode = false;
        } else {
            this.validAnimalCode = true;
        }
    }
    public validateAnimalName(){
        if (this.stringUtilService.isEmpty(this.item.name)) {
            this.errorMessages.push('Name non valide');
            this.validAnimalName = false;
        } else {
            this.validAnimalName = true;
        }
    }



   public async openCreateAnimalType(animalType: string) {
        const isPermistted = await this.roleService.isPermitted('AnimalType', 'edit');
        if(isPermistted) {
             this.animalType = new AnimalTypeDto();
             this.createAnimalTypeDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }
   public async openCreateAnimalSpecie(animalSpecie: string) {
        const isPermistted = await this.roleService.isPermitted('AnimalSpecie', 'edit');
        if(isPermistted) {
             this.animalSpecie = new AnimalSpecieDto();
             this.createAnimalSpecieDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get gender(): GenderDto {
       return this.genderService.item;
   }
  set gender(value: GenderDto) {
        this.genderService.item = value;
   }
   get genders(): Array<GenderDto> {
        return this.genderService.items;
   }
   set genders(value: Array<GenderDto>) {
        this.genderService.items = value;
   }
   get createGenderDialog(): boolean {
       return this.genderService.createDialog;
   }
  set createGenderDialog(value: boolean) {
       this.genderService.createDialog= value;
   }
   get animalType(): AnimalTypeDto {
       return this.animalTypeService.item;
   }
  set animalType(value: AnimalTypeDto) {
        this.animalTypeService.item = value;
   }
   get animalTypes(): Array<AnimalTypeDto> {
        return this.animalTypeService.items;
   }
   set animalTypes(value: Array<AnimalTypeDto>) {
        this.animalTypeService.items = value;
   }
   get createAnimalTypeDialog(): boolean {
       return this.animalTypeService.createDialog;
   }
  set createAnimalTypeDialog(value: boolean) {
       this.animalTypeService.createDialog= value;
   }
   get animalSpecie(): AnimalSpecieDto {
       return this.animalSpecieService.item;
   }
  set animalSpecie(value: AnimalSpecieDto) {
        this.animalSpecieService.item = value;
   }
   get animalSpecies(): Array<AnimalSpecieDto> {
        return this.animalSpecieService.items;
   }
   set animalSpecies(value: Array<AnimalSpecieDto>) {
        this.animalSpecieService.items = value;
   }
   get createAnimalSpecieDialog(): boolean {
       return this.animalSpecieService.createDialog;
   }
  set createAnimalSpecieDialog(value: boolean) {
       this.animalSpecieService.createDialog= value;
   }
   get marketCategory(): MarketCategoryDto {
       return this.marketCategoryService.item;
   }
  set marketCategory(value: MarketCategoryDto) {
        this.marketCategoryService.item = value;
   }
   get marketCategorys(): Array<MarketCategoryDto> {
        return this.marketCategoryService.items;
   }
   set marketCategorys(value: Array<MarketCategoryDto>) {
        this.marketCategoryService.items = value;
   }
   get createMarketCategoryDialog(): boolean {
       return this.marketCategoryService.createDialog;
   }
  set createMarketCategoryDialog(value: boolean) {
       this.marketCategoryService.createDialog= value;
   }
   get ageCategory(): AgeCategoryDto {
       return this.ageCategoryService.item;
   }
  set ageCategory(value: AgeCategoryDto) {
        this.ageCategoryService.item = value;
   }
   get ageCategorys(): Array<AgeCategoryDto> {
        return this.ageCategoryService.items;
   }
   set ageCategorys(value: Array<AgeCategoryDto>) {
        this.ageCategoryService.items = value;
   }
   get createAgeCategoryDialog(): boolean {
       return this.ageCategoryService.createDialog;
   }
  set createAgeCategoryDialog(value: boolean) {
       this.ageCategoryService.createDialog= value;
   }


    get validAnimalCode(): boolean {
        return this._validAnimalCode;
    }
    set validAnimalCode(value: boolean) {
        this._validAnimalCode = value;
    }
    get validAnimalName(): boolean {
        return this._validAnimalName;
    }
    set validAnimalName(value: boolean) {
        this._validAnimalName = value;
    }

    get validGenderCode(): boolean {
        return this._validGenderCode;
    }
    set validGenderCode(value: boolean) {
        this._validGenderCode = value;
    }
    get validGenderLibelle(): boolean {
        return this._validGenderLibelle;
    }
    set validGenderLibelle(value: boolean) {
        this._validGenderLibelle = value;
    }
    get validAgeCategoryCode(): boolean {
        return this._validAgeCategoryCode;
    }
    set validAgeCategoryCode(value: boolean) {
        this._validAgeCategoryCode = value;
    }
    get validAgeCategoryLibelle(): boolean {
        return this._validAgeCategoryLibelle;
    }
    set validAgeCategoryLibelle(value: boolean) {
        this._validAgeCategoryLibelle = value;
    }
    get validAnimalSpecieCode(): boolean {
        return this._validAnimalSpecieCode;
    }
    set validAnimalSpecieCode(value: boolean) {
        this._validAnimalSpecieCode = value;
    }
    get validAnimalSpecieLibelle(): boolean {
        return this._validAnimalSpecieLibelle;
    }
    set validAnimalSpecieLibelle(value: boolean) {
        this._validAnimalSpecieLibelle = value;
    }
    get validAnimalTypeCode(): boolean {
        return this._validAnimalTypeCode;
    }
    set validAnimalTypeCode(value: boolean) {
        this._validAnimalTypeCode = value;
    }
    get validAnimalTypeLibelle(): boolean {
        return this._validAnimalTypeLibelle;
    }
    set validAnimalTypeLibelle(value: boolean) {
        this._validAnimalTypeLibelle = value;
    }
    get validMarketCategoryCode(): boolean {
        return this._validMarketCategoryCode;
    }
    set validMarketCategoryCode(value: boolean) {
        this._validMarketCategoryCode = value;
    }
    get validMarketCategoryLibelle(): boolean {
        return this._validMarketCategoryLibelle;
    }
    set validMarketCategoryLibelle(value: boolean) {
        this._validMarketCategoryLibelle = value;
    }
}
