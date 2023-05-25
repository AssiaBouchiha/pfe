import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {AnimalTypeService} from 'src/app/controller/service/AnimalType.service';
import {AnimalTypeDto} from 'src/app/controller/model/AnimalType.model';
import {AnimalTypeCriteria} from 'src/app/controller/criteria/AnimalTypeCriteria.model';



@Component({
  selector: 'app-animal-type-edit-admin',
  templateUrl: './animal-type-edit-admin.component.html'
})
export class AnimalTypeEditAdminComponent extends AbstractEditController<AnimalTypeDto, AnimalTypeCriteria, AnimalTypeService>   implements OnInit {


    private _validAnimalTypeCode = true;
    private _validAnimalTypeLibelle = true;




    constructor( private animalTypeService: AnimalTypeService ) {
        super(animalTypeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validAnimalTypeCode = value;
        this.validAnimalTypeLibelle = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAnimalTypeCode();
        this.validateAnimalTypeLibelle();
    }
    public validateAnimalTypeCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validAnimalTypeCode = false;
        } else {
            this.validAnimalTypeCode = true;
        }
    }
    public validateAnimalTypeLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
            this.errorMessages.push('Libelle non valide');
            this.validAnimalTypeLibelle = false;
        } else {
            this.validAnimalTypeLibelle = true;
        }
    }






    get validAnimalTypeCode(): boolean {
        return this._validAnimalTypeCode;
    }
    set validAnimalTypeCode(value: boolean) {
        this._validAnimalTypeCode = value;
    }
    get validAnimalTypeLibelle(): boolean {
        return this._validAnimalTypeLibelle;
    }
    set validAnimalTypeLibelle(value: boolean) {
        this._validAnimalTypeLibelle = value;
    }

}
