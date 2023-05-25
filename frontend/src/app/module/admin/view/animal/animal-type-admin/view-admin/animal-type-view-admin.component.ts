import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AnimalTypeService} from 'src/app/controller/service/AnimalType.service';
import {AnimalTypeDto} from 'src/app/controller/model/AnimalType.model';
import {AnimalTypeCriteria} from 'src/app/controller/criteria/AnimalTypeCriteria.model';

@Component({
  selector: 'app-animal-type-view-admin',
  templateUrl: './animal-type-view-admin.component.html'
})
export class AnimalTypeViewAdminComponent extends AbstractViewController<AnimalTypeDto, AnimalTypeCriteria, AnimalTypeService> implements OnInit {


    constructor(private animalTypeService: AnimalTypeService){
        super(animalTypeService);
    }

    ngOnInit(): void {
    }




}
