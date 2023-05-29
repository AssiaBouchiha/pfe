import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EnvironmentService} from 'src/app/controller/service/Environment.service';
import {EnvironmentDto} from 'src/app/controller/model/Environment.model';
import {EnvironmentCriteria} from 'src/app/controller/criteria/EnvironmentCriteria.model';

import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderService} from 'src/app/controller/service/Gender.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
@Component({
  selector: 'app-environment-view-admin',
  templateUrl: './environment-view-admin.component.html'
})
export class EnvironmentViewAdminComponent extends AbstractViewController<EnvironmentDto, EnvironmentCriteria, EnvironmentService> implements OnInit {


    constructor(private environmentService: EnvironmentService, private genderService: GenderService, private ageCategoryService: AgeCategoryService){
        super(environmentService);
    }

    ngOnInit(): void {
        this.gender = new GenderDto();
        this.genderService.findAll().subscribe((data) => this.genders = data);
        this.ageCategory = new AgeCategoryDto();
        this.ageCategoryService.findAll().subscribe((data) => this.ageCategorys = data);
    }


    get gender(): GenderDto {
       return this.genderService.item;
    }
    set gender(value: GenderDto) {
        this.genderService.item = value;
    }
    get genders():Array<GenderDto> {
       return this.genderService.items;
    }
    set genders(value: Array<GenderDto>) {
        this.genderService.items = value;
    }
    get ageCategory(): AgeCategoryDto {
       return this.ageCategoryService.item;
    }
    set ageCategory(value: AgeCategoryDto) {
        this.ageCategoryService.item = value;
    }
    get ageCategorys():Array<AgeCategoryDto> {
       return this.ageCategoryService.items;
    }
    set ageCategorys(value: Array<AgeCategoryDto>) {
        this.ageCategoryService.items = value;
    }


}
