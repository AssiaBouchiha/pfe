import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {BrandService} from 'src/app/controller/service/Brand.service';
import {BrandDto} from 'src/app/controller/model/Brand.model';
import {BrandCriteria} from 'src/app/controller/criteria/BrandCriteria.model';



@Component({
  selector: 'app-brand-edit-admin',
  templateUrl: './brand-edit-admin.component.html'
})
export class BrandEditAdminComponent extends AbstractEditController<BrandDto, BrandCriteria, BrandService>   implements OnInit {


    private _validBrandCode = true;
    private _validBrandLibelle = true;




    constructor( private brandService: BrandService ) {
        super(brandService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validBrandCode = value;
        this.validBrandLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateBrandCode();
        this.validateBrandLibelle();
    }
    public validateBrandCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validBrandCode = false;
        } else {
            this.validBrandCode = true;
        }
    }
    public validateBrandLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validBrandLibelle = false;
        } else {
            this.validBrandLibelle = true;
        }
    }






    get validBrandCode(): boolean {
        return this._validBrandCode;
    }
    set validBrandCode(value: boolean) {
        this._validBrandCode = value;
    }
    get validBrandLibelle(): boolean {
        return this._validBrandLibelle;
    }
    set validBrandLibelle(value: boolean) {
        this._validBrandLibelle = value;
    }

}
