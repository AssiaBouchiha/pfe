import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {InstitutionService} from 'src/app/controller/service/Institution.service';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {InstitutionCriteria} from 'src/app/controller/criteria/InstitutionCriteria.model';

@Component({
  selector: 'app-institution-view-admin',
  templateUrl: './institution-view-admin.component.html'
})
export class InstitutionViewAdminComponent extends AbstractViewController<InstitutionDto, InstitutionCriteria, InstitutionService> implements OnInit {


    constructor(private institutionService: InstitutionService){
        super(institutionService);
    }

    ngOnInit(): void {
    }




}
