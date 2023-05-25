import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {GenderService} from 'src/app/controller/service/Gender.service';
import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderCriteria} from 'src/app/controller/criteria/GenderCriteria.model';

@Component({
  selector: 'app-gender-view-admin',
  templateUrl: './gender-view-admin.component.html'
})
export class GenderViewAdminComponent extends AbstractViewController<GenderDto, GenderCriteria, GenderService> implements OnInit {


    constructor(private genderService: GenderService){
        super(genderService);
    }

    ngOnInit(): void {
    }




}
