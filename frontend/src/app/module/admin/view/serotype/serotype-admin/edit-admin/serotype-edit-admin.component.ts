import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SerotypeService} from 'src/app/controller/service/Serotype.service';
import {SerotypeDto} from 'src/app/controller/model/Serotype.model';
import {SerotypeCriteria} from 'src/app/controller/criteria/SerotypeCriteria.model';



@Component({
  selector: 'app-serotype-edit-admin',
  templateUrl: './serotype-edit-admin.component.html'
})
export class SerotypeEditAdminComponent extends AbstractEditController<SerotypeDto, SerotypeCriteria, SerotypeService>   implements OnInit {


    private _validSerotypeCode = true;
    private _validSerotypeLibelle = true;




    constructor( private serotypeService: SerotypeService ) {
        super(serotypeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validSerotypeCode = value;
        this.validSerotypeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSerotypeCode();
        this.validateSerotypeLibelle();
    }
    public validateSerotypeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validSerotypeCode = false;
        } else {
            this.validSerotypeCode = true;
        }
    }
    public validateSerotypeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validSerotypeLibelle = false;
        } else {
            this.validSerotypeLibelle = true;
        }
    }






    get validSerotypeCode(): boolean {
        return this._validSerotypeCode;
    }
    set validSerotypeCode(value: boolean) {
        this._validSerotypeCode = value;
    }
    get validSerotypeLibelle(): boolean {
        return this._validSerotypeLibelle;
    }
    set validSerotypeLibelle(value: boolean) {
        this._validSerotypeLibelle = value;
    }

}
