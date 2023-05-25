import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {SeroTypeService} from 'src/app/controller/service/SeroType.service';
import {SeroTypeDto} from 'src/app/controller/model/SeroType.model';
import {SeroTypeCriteria} from 'src/app/controller/criteria/SeroTypeCriteria.model';
@Component({
  selector: 'app-sero-type-create-admin',
  templateUrl: './sero-type-create-admin.component.html'
})
export class SeroTypeCreateAdminComponent extends AbstractCreateController<SeroTypeDto, SeroTypeCriteria, SeroTypeService>  implements OnInit {



   private _validSeroTypeCode = true;
   private _validSeroTypeLibelle = true;

    constructor( private seroTypeService: SeroTypeService ) {
        super(seroTypeService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validSeroTypeCode = value;
        this.validSeroTypeLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSeroTypeCode();
        this.validateSeroTypeLibelle();
    }

    public validateSeroTypeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validSeroTypeCode = false;
        } else {
            this.validSeroTypeCode = true;
        }
    }
    public validateSeroTypeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validSeroTypeLibelle = false;
        } else {
            this.validSeroTypeLibelle = true;
        }
    }






    get validSeroTypeCode(): boolean {
        return this._validSeroTypeCode;
    }

    set validSeroTypeCode(value: boolean) {
         this._validSeroTypeCode = value;
    }
    get validSeroTypeLibelle(): boolean {
        return this._validSeroTypeLibelle;
    }

    set validSeroTypeLibelle(value: boolean) {
         this._validSeroTypeLibelle = value;
    }



}
