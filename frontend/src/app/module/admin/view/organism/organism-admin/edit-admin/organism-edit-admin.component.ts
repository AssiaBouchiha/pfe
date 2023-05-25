import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {OrganismService} from 'src/app/controller/service/Organism.service';
import {OrganismDto} from 'src/app/controller/model/Organism.model';
import {OrganismCriteria} from 'src/app/controller/criteria/OrganismCriteria.model';



@Component({
  selector: 'app-organism-edit-admin',
  templateUrl: './organism-edit-admin.component.html'
})
export class OrganismEditAdminComponent extends AbstractEditController<OrganismDto, OrganismCriteria, OrganismService>   implements OnInit {


    private _validOrganismCode = true;
    private _validOrganismLibelle = true;




    constructor( private organismService: OrganismService ) {
        super(organismService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validOrganismCode = value;
        this.validOrganismLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateOrganismCode();
        this.validateOrganismLibelle();
    }
    public validateOrganismCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validOrganismCode = false;
        } else {
            this.validOrganismCode = true;
        }
    }
    public validateOrganismLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validOrganismLibelle = false;
        } else {
            this.validOrganismLibelle = true;
        }
    }






    get validOrganismCode(): boolean {
        return this._validOrganismCode;
    }
    set validOrganismCode(value: boolean) {
        this._validOrganismCode = value;
    }
    get validOrganismLibelle(): boolean {
        return this._validOrganismLibelle;
    }
    set validOrganismLibelle(value: boolean) {
        this._validOrganismLibelle = value;
    }

}
