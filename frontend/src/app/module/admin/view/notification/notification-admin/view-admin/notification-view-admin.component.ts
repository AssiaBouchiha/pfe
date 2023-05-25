import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {NotificationService} from 'src/app/controller/service/Notification.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationCriteria} from 'src/app/controller/criteria/NotificationCriteria.model';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-notification-view-admin',
  templateUrl: './notification-view-admin.component.html'
})
export class NotificationViewAdminComponent extends AbstractViewController<NotificationDto, NotificationCriteria, NotificationService> implements OnInit {


    constructor(private notificationService: NotificationService, private laboratoryService: LaboratoryService){
        super(notificationService);
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
