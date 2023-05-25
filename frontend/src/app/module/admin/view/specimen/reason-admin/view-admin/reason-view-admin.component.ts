import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ReasonService} from 'src/app/controller/service/Reason.service';
import {ReasonDto} from 'src/app/controller/model/Reason.model';
import {ReasonCriteria} from 'src/app/controller/criteria/ReasonCriteria.model';

@Component({
  selector: 'app-reason-view-admin',
  templateUrl: './reason-view-admin.component.html'
})
export class ReasonViewAdminComponent extends AbstractViewController<ReasonDto, ReasonCriteria, ReasonService> implements OnInit {


    constructor(private reasonService: ReasonService){
        super(reasonService);
    }

    ngOnInit(): void {
    }




}
