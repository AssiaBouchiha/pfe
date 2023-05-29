import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {EnvironmentService} from 'src/app/controller/service/Environment.service';
import {EnvironmentDto} from 'src/app/controller/model/Environment.model';
import {EnvironmentCriteria} from 'src/app/controller/criteria/EnvironmentCriteria.model';


import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderService} from 'src/app/controller/service/Gender.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';

@Component({
  selector: 'app-environment-edit-admin',
  templateUrl: './environment-edit-admin.component.html'
})
export class EnvironmentEditAdminComponent extends AbstractEditController<EnvironmentDto, EnvironmentCriteria, EnvironmentService>   implements OnInit {


    private _validEnvironmentCode = true;

    private _validGenderCode = true;
    private _validGenderLibelle = true;
    private _validAgeCategoryCode = true;
    private _validAgeCategoryLibelle = true;



    constructor( private environmentService: EnvironmentService , private genderService: GenderService, private ageCategoryService: AgeCategoryService) {
        super(environmentService);
    }

    ngOnInit(): void {
    this.gender = new GenderDto();
    this.genderService.findAll().subscribe((data) => this.genders = data);
    this.ageCategory = new AgeCategoryDto();
    this.ageCategoryService.findAll().subscribe((data) => this.ageCategorys = data);
}
    public prepareEdit() {
        this.item.dateofbirth = this.environmentService.format(this.item.dateofbirth);
    }



    public setValidation(value : boolean){
        this.validEnvironmentCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEnvironmentCode();
    }
    public validateEnvironmentCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validEnvironmentCode = false;
        } else {
            this.validEnvironmentCode = true;
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


    get validEnvironmentCode(): boolean {
        return this._validEnvironmentCode;
    }
    set validEnvironmentCode(value: boolean) {
        this._validEnvironmentCode = value;
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
}
