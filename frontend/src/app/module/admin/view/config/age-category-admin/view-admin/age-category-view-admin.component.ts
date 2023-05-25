import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryCriteria} from 'src/app/controller/criteria/AgeCategoryCriteria.model';

@Component({
  selector: 'app-age-category-view-admin',
  templateUrl: './age-category-view-admin.component.html'
})
export class AgeCategoryViewAdminComponent extends AbstractViewController<AgeCategoryDto, AgeCategoryCriteria, AgeCategoryService> implements OnInit {


    constructor(private ageCategoryService: AgeCategoryService){
        super(ageCategoryService);
    }

    ngOnInit(): void {
    }




}
