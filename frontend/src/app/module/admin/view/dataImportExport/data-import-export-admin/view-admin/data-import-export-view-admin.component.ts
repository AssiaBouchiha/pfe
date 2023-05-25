import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportCriteria} from 'src/app/controller/criteria/DataImportExportCriteria.model';

import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';
import {SpecimenService} from 'src/app/controller/service/Specimen.service';
import {LocationDataDto} from 'src/app/controller/model/LocationData.model';
import {LocationDataService} from 'src/app/controller/service/LocationData.service';
@Component({
  selector: 'app-data-import-export-view-admin',
  templateUrl: './data-import-export-view-admin.component.html'
})
export class DataImportExportViewAdminComponent extends AbstractViewController<DataImportExportDto, DataImportExportCriteria, DataImportExportService> implements OnInit {


    constructor(private dataImportExportService: DataImportExportService, private microbiologyService: MicrobiologyService, private specimenService: SpecimenService, private locationDataService: LocationDataService){
        super(dataImportExportService);
    }

    ngOnInit(): void {
        this.locationData = new LocationDataDto();
        this.locationDataService.findAll().subscribe((data) => this.locationDatas = data);
        this.specimen = new SpecimenDto();
        this.specimenService.findAll().subscribe((data) => this.specimens = data);
        this.microbiology = new MicrobiologyDto();
        this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
    }


    get microbiology(): MicrobiologyDto {
       return this.microbiologyService.item;
    }
    set microbiology(value: MicrobiologyDto) {
        this.microbiologyService.item = value;
    }
    get microbiologys():Array<MicrobiologyDto> {
       return this.microbiologyService.items;
    }
    set microbiologys(value: Array<MicrobiologyDto>) {
        this.microbiologyService.items = value;
    }
    get specimen(): SpecimenDto {
       return this.specimenService.item;
    }
    set specimen(value: SpecimenDto) {
        this.specimenService.item = value;
    }
    get specimens():Array<SpecimenDto> {
       return this.specimenService.items;
    }
    set specimens(value: Array<SpecimenDto>) {
        this.specimenService.items = value;
    }
    get locationData(): LocationDataDto {
       return this.locationDataService.item;
    }
    set locationData(value: LocationDataDto) {
        this.locationDataService.item = value;
    }
    get locationDatas():Array<LocationDataDto> {
       return this.locationDataService.items;
    }
    set locationDatas(value: Array<LocationDataDto>) {
        this.locationDataService.items = value;
    }


}
