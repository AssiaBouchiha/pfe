import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DataAnalysisService} from 'src/app/controller/service/DataAnalysis.service';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {DataAnalysisCriteria} from 'src/app/controller/criteria/DataAnalysisCriteria.model';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-data-analysis-create-admin',
  templateUrl: './data-analysis-create-admin.component.html'
})
export class DataAnalysisCreateAdminComponent extends AbstractCreateController<DataAnalysisDto, DataAnalysisCriteria, DataAnalysisService>  implements OnInit {



   private _validDataAnalysisCode = true;
    private _validLaboratoryCode = true;

    constructor( private dataAnalysisService: DataAnalysisService , private laboratoryService: LaboratoryService) {
        super(dataAnalysisService);
    }

    ngOnInit(): void {
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}





    public setValidation(value: boolean){
        this.validDataAnalysisCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateDataAnalysisCode();
    }

    public validateDataAnalysisCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validDataAnalysisCode = false;
        } else {
            this.validDataAnalysisCode = true;
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



    get validDataAnalysisCode(): boolean {
        return this._validDataAnalysisCode;
    }

    set validDataAnalysisCode(value: boolean) {
         this._validDataAnalysisCode = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }


}
