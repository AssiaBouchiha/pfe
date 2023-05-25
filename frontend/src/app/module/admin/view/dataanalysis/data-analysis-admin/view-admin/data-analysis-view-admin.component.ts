import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DataAnalysisService} from 'src/app/controller/service/DataAnalysis.service';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {DataAnalysisCriteria} from 'src/app/controller/criteria/DataAnalysisCriteria.model';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-data-analysis-view-admin',
  templateUrl: './data-analysis-view-admin.component.html'
})
export class DataAnalysisViewAdminComponent extends AbstractViewController<DataAnalysisDto, DataAnalysisCriteria, DataAnalysisService> implements OnInit {


    constructor(private dataAnalysisService: DataAnalysisService, private laboratoryService: LaboratoryService){
        super(dataAnalysisService);
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
