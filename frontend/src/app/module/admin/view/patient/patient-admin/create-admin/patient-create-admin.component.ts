import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {PatientService} from 'src/app/controller/service/Patient.service';
import {PatientDto} from 'src/app/controller/model/Patient.model';
import {PatientCriteria} from 'src/app/controller/criteria/PatientCriteria.model';
import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderService} from 'src/app/controller/service/Gender.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
@Component({
  selector: 'app-patient-create-admin',
  templateUrl: './patient-create-admin.component.html'
})
export class PatientCreateAdminComponent extends AbstractCreateController<PatientDto, PatientCriteria, PatientService>  implements OnInit {



   private _validPatientCode = true;
    private _validGenderCode = true;
    private _validGenderLibelle = true;
    private _validAgeCategoryCode = true;
    private _validAgeCategoryLibelle = true;

    constructor( private patientService: PatientService , private genderService: GenderService, private ageCategoryService: AgeCategoryService) {
        super(patientService);
    }

    ngOnInit(): void {
    this.gender = new GenderDto();
    this.genderService.findAll().subscribe((data) => this.genders = data);
    this.ageCategory = new AgeCategoryDto();
    this.ageCategoryService.findAll().subscribe((data) => this.ageCategorys = data);
}





    public setValidation(value: boolean){
        this.validPatientCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validatePatientCode();
    }

    public validatePatientCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validPatientCode = false;
        } else {
            this.validPatientCode = true;
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



    get validPatientCode(): boolean {
        return this._validPatientCode;
    }

    set validPatientCode(value: boolean) {
         this._validPatientCode = value;
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
