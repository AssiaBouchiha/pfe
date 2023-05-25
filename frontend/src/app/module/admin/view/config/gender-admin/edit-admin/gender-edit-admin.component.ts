import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {GenderService} from 'src/app/controller/service/Gender.service';
import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderCriteria} from 'src/app/controller/criteria/GenderCriteria.model';



@Component({
  selector: 'app-gender-edit-admin',
  templateUrl: './gender-edit-admin.component.html'
})
export class GenderEditAdminComponent extends AbstractEditController<GenderDto, GenderCriteria, GenderService>   implements OnInit {


    private _validGenderCode = true;
    private _validGenderLibelle = true;




    constructor( private genderService: GenderService ) {
        super(genderService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validGenderCode = value;
        this.validGenderLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateGenderCode();
        this.validateGenderLibelle();
    }
    public validateGenderCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validGenderCode = false;
        } else {
            this.validGenderCode = true;
        }
    }
    public validateGenderLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validGenderLibelle = false;
        } else {
            this.validGenderLibelle = true;
        }
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

}
