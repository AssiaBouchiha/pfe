import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {LocationTypeService} from 'src/app/controller/service/LocationType.service';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';
import {LocationTypeCriteria} from 'src/app/controller/criteria/LocationTypeCriteria.model';



@Component({
  selector: 'app-location-type-edit-admin',
  templateUrl: './location-type-edit-admin.component.html'
})
export class LocationTypeEditAdminComponent extends AbstractEditController<LocationTypeDto, LocationTypeCriteria, LocationTypeService>   implements OnInit {


    private _validLocationTypeCode = true;
    private _validLocationTypeLibelle = true;




    constructor( private locationTypeService: LocationTypeService ) {
        super(locationTypeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validLocationTypeCode = value;
        this.validLocationTypeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateLocationTypeCode();
        this.validateLocationTypeLibelle();
    }
    public validateLocationTypeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validLocationTypeCode = false;
        } else {
            this.validLocationTypeCode = true;
        }
    }
    public validateLocationTypeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validLocationTypeLibelle = false;
        } else {
            this.validLocationTypeLibelle = true;
        }
    }






    get validLocationTypeCode(): boolean {
        return this._validLocationTypeCode;
    }
    set validLocationTypeCode(value: boolean) {
        this._validLocationTypeCode = value;
    }
    get validLocationTypeLibelle(): boolean {
        return this._validLocationTypeLibelle;
    }
    set validLocationTypeLibelle(value: boolean) {
        this._validLocationTypeLibelle = value;
    }

}
