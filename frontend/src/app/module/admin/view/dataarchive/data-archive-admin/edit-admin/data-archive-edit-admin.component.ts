import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {DataArchiveService} from 'src/app/controller/service/DataArchive.service';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {DataArchiveCriteria} from 'src/app/controller/criteria/DataArchiveCriteria.model';


import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';

@Component({
  selector: 'app-data-archive-edit-admin',
  templateUrl: './data-archive-edit-admin.component.html'
})
export class DataArchiveEditAdminComponent extends AbstractEditController<DataArchiveDto, DataArchiveCriteria, DataArchiveService>   implements OnInit {


    private _validDataArchiveCode = true;

    private _validLaboratoryCode = true;



    constructor( private dataArchiveService: DataArchiveService , private laboratoryService: LaboratoryService) {
        super(dataArchiveService);
    }

    ngOnInit(): void {
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}


    public setValidation(value : boolean){
        this.validDataArchiveCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateDataArchiveCode();
    }
    public validateDataArchiveCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validDataArchiveCode = false;
        } else {
            this.validDataArchiveCode = true;
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


    get validDataArchiveCode(): boolean {
        return this._validDataArchiveCode;
    }
    set validDataArchiveCode(value: boolean) {
        this._validDataArchiveCode = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }
}
