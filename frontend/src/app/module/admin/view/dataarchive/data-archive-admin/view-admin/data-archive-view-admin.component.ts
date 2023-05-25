import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DataArchiveService} from 'src/app/controller/service/DataArchive.service';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {DataArchiveCriteria} from 'src/app/controller/criteria/DataArchiveCriteria.model';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
@Component({
  selector: 'app-data-archive-view-admin',
  templateUrl: './data-archive-view-admin.component.html'
})
export class DataArchiveViewAdminComponent extends AbstractViewController<DataArchiveDto, DataArchiveCriteria, DataArchiveService> implements OnInit {


    constructor(private dataArchiveService: DataArchiveService, private laboratoryService: LaboratoryService){
        super(dataArchiveService);
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
