import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieCriteria} from 'src/app/controller/criteria/AnimalSpecieCriteria.model';

@Component({
  selector: 'app-animal-specie-view-admin',
  templateUrl: './animal-specie-view-admin.component.html'
})
export class AnimalSpecieViewAdminComponent extends AbstractViewController<AnimalSpecieDto, AnimalSpecieCriteria, AnimalSpecieService> implements OnInit {


    constructor(private animalSpecieService: AnimalSpecieService){
        super(animalSpecieService);
    }

    ngOnInit(): void {
    }




}
