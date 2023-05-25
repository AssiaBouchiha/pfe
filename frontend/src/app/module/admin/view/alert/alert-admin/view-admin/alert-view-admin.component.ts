import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AlertService} from 'src/app/controller/service/Alert.service';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {AlertCriteria} from 'src/app/controller/criteria/AlertCriteria.model';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-alert-view-admin',
  templateUrl: './alert-view-admin.component.html'
})
export class AlertViewAdminComponent extends AbstractViewController<AlertDto, AlertCriteria, AlertService> implements OnInit {


    constructor(private alertService: AlertService, private laboratoryService: LaboratoryService){
        super(alertService);
    }

    ngOnInit(): void {
        this.laboratory = new LaboratoryDto();
        this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
    }


    get laboratory(): LaboratoryDto {
       return this.laboratoryService.item;
    }
    set laboratory(value: LaboratoryDto) {
        this.laboratoryService.item = value;
    }
    get laboratorys():Array<LaboratoryDto> {
       return this.laboratoryService.items;
    }
    set laboratorys(value: Array<LaboratoryDto>) {
        this.laboratoryService.items = value;
    }


}
