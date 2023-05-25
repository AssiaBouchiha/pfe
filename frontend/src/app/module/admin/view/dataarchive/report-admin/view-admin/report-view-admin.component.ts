import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {ReportService} from 'src/app/controller/service/Report.service';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {ReportCriteria} from 'src/app/controller/criteria/ReportCriteria.model';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-report-view-admin',
  templateUrl: './report-view-admin.component.html'
})
export class ReportViewAdminComponent extends AbstractViewController<ReportDto, ReportCriteria, ReportService> implements OnInit {


    constructor(private reportService: ReportService, private laboratoryService: LaboratoryService){
        super(reportService);
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
