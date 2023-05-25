import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryCriteria} from 'src/app/controller/criteria/MarketCategoryCriteria.model';
@Component({
  selector: 'app-market-category-create-admin',
  templateUrl: './market-category-create-admin.component.html'
})
export class MarketCategoryCreateAdminComponent extends AbstractCreateController<MarketCategoryDto, MarketCategoryCriteria, MarketCategoryService>  implements OnInit {



   private _validMarketCategoryCode = true;
   private _validMarketCategoryLibelle = true;

    constructor( private marketCategoryService: MarketCategoryService ) {
        super(marketCategoryService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validMarketCategoryCode = value;
        this.validMarketCategoryLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateMarketCategoryCode();
        this.validateMarketCategoryLibelle();
    }

    public validateMarketCategoryCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validMarketCategoryCode = false;
        } else {
            this.validMarketCategoryCode = true;
        }
    }
    public validateMarketCategoryLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validMarketCategoryLibelle = false;
        } else {
            this.validMarketCategoryLibelle = true;
        }
    }






    get validMarketCategoryCode(): boolean {
        return this._validMarketCategoryCode;
    }

    set validMarketCategoryCode(value: boolean) {
         this._validMarketCategoryCode = value;
    }
    get validMarketCategoryLibelle(): boolean {
        return this._validMarketCategoryLibelle;
    }

    set validMarketCategoryLibelle(value: boolean) {
         this._validMarketCategoryLibelle = value;
    }



}
