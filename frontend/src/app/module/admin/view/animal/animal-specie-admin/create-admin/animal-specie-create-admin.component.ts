import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieCriteria} from 'src/app/controller/criteria/AnimalSpecieCriteria.model';
@Component({
  selector: 'app-animal-specie-create-admin',
  templateUrl: './animal-specie-create-admin.component.html'
})
export class AnimalSpecieCreateAdminComponent extends AbstractCreateController<AnimalSpecieDto, AnimalSpecieCriteria, AnimalSpecieService>  implements OnInit {



   private _validAnimalSpecieCode = true;
   private _validAnimalSpecieLibelle = true;

    constructor( private animalSpecieService: AnimalSpecieService ) {
        super(animalSpecieService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validAnimalSpecieCode = value;
        this.validAnimalSpecieLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAnimalSpecieCode();
        this.validateAnimalSpecieLibelle();
    }

    public validateAnimalSpecieCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validAnimalSpecieCode = false;
        } else {
            this.validAnimalSpecieCode = true;
        }
    }
    public validateAnimalSpecieLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validAnimalSpecieLibelle = false;
        } else {
            this.validAnimalSpecieLibelle = true;
        }
    }






    get validAnimalSpecieCode(): boolean {
        return this._validAnimalSpecieCode;
    }

    set validAnimalSpecieCode(value: boolean) {
         this._validAnimalSpecieCode = value;
    }
    get validAnimalSpecieLibelle(): boolean {
        return this._validAnimalSpecieLibelle;
    }

    set validAnimalSpecieLibelle(value: boolean) {
         this._validAnimalSpecieLibelle = value;
    }



}
