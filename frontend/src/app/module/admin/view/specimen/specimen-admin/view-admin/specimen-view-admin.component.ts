import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SpecimenService} from 'src/app/controller/service/Specimen.service';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';
import {SpecimenCriteria} from 'src/app/controller/criteria/SpecimenCriteria.model';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {ReasonDto} from 'src/app/controller/model/Reason.model';
import {ReasonService} from 'src/app/controller/service/Reason.service';
@Component({
  selector: 'app-specimen-view-admin',
  templateUrl: './specimen-view-admin.component.html'
})
export class SpecimenViewAdminComponent extends AbstractViewController<SpecimenDto, SpecimenCriteria, SpecimenService> implements OnInit {


    constructor(private specimenService: SpecimenService, private dataImportExportService: DataImportExportService, private reasonService: ReasonService){
        super(specimenService);
    }

    ngOnInit(): void {
        this.reason = new ReasonDto();
        this.reasonService.findAll().subscribe((data) => this.reasons = data);
        this.dataImportExport = new DataImportExportDto();
        this.dataImportExportService.findAll().subscribe((data) => this.dataImportExports = data);
    }


    get dataImportExport(): DataImportExportDto {
       return this.dataImportExportService.item;
    }
    set dataImportExport(value: DataImportExportDto) {
        this.dataImportExportService.item = value;
    }
    get dataImportExports():Array<DataImportExportDto> {
       return this.dataImportExportService.items;
    }
    set dataImportExports(value: Array<DataImportExportDto>) {
        this.dataImportExportService.items = value;
    }
    get reason(): ReasonDto {
       return this.reasonService.item;
    }
    set reason(value: ReasonDto) {
        this.reasonService.item = value;
    }
    get reasons():Array<ReasonDto> {
       return this.reasonService.items;
    }
    set reasons(value: Array<ReasonDto>) {
        this.reasonService.items = value;
    }


}
