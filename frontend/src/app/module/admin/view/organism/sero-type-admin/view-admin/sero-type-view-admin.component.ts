import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SeroTypeService} from 'src/app/controller/service/SeroType.service';
import {SeroTypeDto} from 'src/app/controller/model/SeroType.model';
import {SeroTypeCriteria} from 'src/app/controller/criteria/SeroTypeCriteria.model';

@Component({
  selector: 'app-sero-type-view-admin',
  templateUrl: './sero-type-view-admin.component.html'
})
export class SeroTypeViewAdminComponent extends AbstractViewController<SeroTypeDto, SeroTypeCriteria, SeroTypeService> implements OnInit {


    constructor(private seroTypeService: SeroTypeService){
        super(seroTypeService);
    }

    ngOnInit(): void {
    }




}
