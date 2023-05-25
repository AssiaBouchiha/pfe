import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryCriteria} from 'src/app/controller/criteria/AgeCategoryCriteria.model';



@Component({
  selector: 'app-age-category-edit-admin',
  templateUrl: './age-category-edit-admin.component.html'
})
export class AgeCategoryEditAdminComponent extends AbstractEditController<AgeCategoryDto, AgeCategoryCriteria, AgeCategoryService>   implements OnInit {


    private _validAgeCategoryCode = true;
    private _validAgeCategoryLibelle = true;




    constructor( private ageCategoryService: AgeCategoryService ) {
        super(ageCategoryService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validAgeCategoryCode = value;
        this.validAgeCategoryLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAgeCategoryCode();
        this.validateAgeCategoryLibelle();
    }
    public validateAgeCategoryCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validAgeCategoryCode = false;
        } else {
            this.validAgeCategoryCode = true;
        }
    }
    public validateAgeCategoryLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validAgeCategoryLibelle = false;
        } else {
            this.validAgeCategoryLibelle = true;
        }
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
