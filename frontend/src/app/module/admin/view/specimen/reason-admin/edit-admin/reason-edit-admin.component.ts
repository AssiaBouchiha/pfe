import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ReasonService} from 'src/app/controller/service/Reason.service';
import {ReasonDto} from 'src/app/controller/model/Reason.model';
import {ReasonCriteria} from 'src/app/controller/criteria/ReasonCriteria.model';



@Component({
  selector: 'app-reason-edit-admin',
  templateUrl: './reason-edit-admin.component.html'
})
export class ReasonEditAdminComponent extends AbstractEditController<ReasonDto, ReasonCriteria, ReasonService>   implements OnInit {


    private _validReasonCode = true;
    private _validReasonLibelle = true;




    constructor( private reasonService: ReasonService ) {
        super(reasonService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validReasonCode = value;
        this.validReasonLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateReasonCode();
        this.validateReasonLibelle();
    }
    public validateReasonCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validReasonCode = false;
        } else {
            this.validReasonCode = true;
        }
    }
    public validateReasonLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validReasonLibelle = false;
        } else {
            this.validReasonLibelle = true;
        }
    }






    get validReasonCode(): boolean {
        return this._validReasonCode;
    }
    set validReasonCode(value: boolean) {
        this._validReasonCode = value;
    }
    get validReasonLibelle(): boolean {
        return this._validReasonLibelle;
    }
    set validReasonLibelle(value: boolean) {
        this._validReasonLibelle = value;
    }

}
