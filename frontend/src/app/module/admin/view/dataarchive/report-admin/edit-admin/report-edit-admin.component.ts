import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {ReportService} from 'src/app/controller/service/Report.service';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {ReportCriteria} from 'src/app/controller/criteria/ReportCriteria.model';


import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';

@Component({
  selector: 'app-report-edit-admin',
  templateUrl: './report-edit-admin.component.html'
})
export class ReportEditAdminComponent extends AbstractEditController<ReportDto, ReportCriteria, ReportService>   implements OnInit {


    private _validReportCode = true;

    private _validLaboratoryCode = true;



    constructor( private reportService: ReportService , private laboratoryService: LaboratoryService) {
        super(reportService);
    }

    ngOnInit(): void {
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}


    public setValidation(value : boolean){
        this.validReportCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateReportCode();
    }
    public validateReportCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validReportCode = false;
        } else {
            this.validReportCode = true;
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


    get validReportCode(): boolean {
        return this._validReportCode;
    }
    set validReportCode(value: boolean) {
        this._validReportCode = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }
}
