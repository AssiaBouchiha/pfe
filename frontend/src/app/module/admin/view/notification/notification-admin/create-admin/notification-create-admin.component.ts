import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {NotificationService} from 'src/app/controller/service/Notification.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationCriteria} from 'src/app/controller/criteria/NotificationCriteria.model';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-notification-create-admin',
  templateUrl: './notification-create-admin.component.html'
})
export class NotificationCreateAdminComponent extends AbstractCreateController<NotificationDto, NotificationCriteria, NotificationService>  implements OnInit {



   private _validNotificationCode = true;
    private _validLaboratoryCode = true;

    constructor( private notificationService: NotificationService , private laboratoryService: LaboratoryService) {
        super(notificationService);
    }

    ngOnInit(): void {
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}





    public setValidation(value: boolean){
        this.validNotificationCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateNotificationCode();
    }

    public validateNotificationCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validNotificationCode = false;
        } else {
            this.validNotificationCode = true;
        }
    }



    get laboratory(): LaboratoryDto {
        return this.laboratoryService.item;
    }
    set laboratory(value: LaboratoryDto) {
        this.laboratoryService.item = value;
    }
    get laboratorys(): Array<LaboratoryDto> {
        return this.laboratoryService.items;
    }
    set laboratorys(value: Array<LaboratoryDto>) {
        this.laboratoryService.items = value;
    }
    get createLaboratoryDialog(): boolean {
       return this.laboratoryService.createDialog;
    }
    set createLaboratoryDialog(value: boolean) {
        this.laboratoryService.createDialog= value;
    }



    get validNotificationCode(): boolean {
        return this._validNotificationCode;
    }

    set validNotificationCode(value: boolean) {
         this._validNotificationCode = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }


}
