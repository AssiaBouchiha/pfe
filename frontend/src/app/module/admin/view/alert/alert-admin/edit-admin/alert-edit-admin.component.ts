import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {AlertService} from 'src/app/controller/service/Alert.service';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {AlertCriteria} from 'src/app/controller/criteria/AlertCriteria.model';


import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';

@Component({
  selector: 'app-alert-edit-admin',
  templateUrl: './alert-edit-admin.component.html'
})
export class AlertEditAdminComponent extends AbstractEditController<AlertDto, AlertCriteria, AlertService>   implements OnInit {


    private _validAlertCode = true;

    private _validLaboratoryCode = true;



    constructor( private alertService: AlertService , private laboratoryService: LaboratoryService) {
        super(alertService);
    }

    ngOnInit(): void {
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}


    public setValidation(value : boolean){
        this.validAlertCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAlertCode();
    }
    public validateAlertCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validAlertCode = false;
        } else {
            this.validAlertCode = true;
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


    get validAlertCode(): boolean {
        return this._validAlertCode;
    }
    set validAlertCode(value: boolean) {
        this._validAlertCode = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }
}
