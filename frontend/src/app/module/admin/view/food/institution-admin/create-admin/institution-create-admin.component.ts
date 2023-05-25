import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {InstitutionService} from 'src/app/controller/service/Institution.service';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {InstitutionCriteria} from 'src/app/controller/criteria/InstitutionCriteria.model';
@Component({
  selector: 'app-institution-create-admin',
  templateUrl: './institution-create-admin.component.html'
})
export class InstitutionCreateAdminComponent extends AbstractCreateController<InstitutionDto, InstitutionCriteria, InstitutionService>  implements OnInit {



   private _validInstitutionCode = true;
   private _validInstitutionLibelle = true;

    constructor( private institutionService: InstitutionService ) {
        super(institutionService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validInstitutionCode = value;
        this.validInstitutionLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateInstitutionCode();
        this.validateInstitutionLibelle();
    }

    public validateInstitutionCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validInstitutionCode = false;
        } else {
            this.validInstitutionCode = true;
        }
    }
    public validateInstitutionLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validInstitutionLibelle = false;
        } else {
            this.validInstitutionLibelle = true;
        }
    }






    get validInstitutionCode(): boolean {
        return this._validInstitutionCode;
    }

    set validInstitutionCode(value: boolean) {
         this._validInstitutionCode = value;
    }
    get validInstitutionLibelle(): boolean {
        return this._validInstitutionLibelle;
    }

    set validInstitutionLibelle(value: boolean) {
         this._validInstitutionLibelle = value;
    }



}
