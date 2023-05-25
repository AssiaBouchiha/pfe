import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryCriteria} from 'src/app/controller/criteria/LaboratoryCriteria.model';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {LaboratoryAntibioticDto} from 'src/app/controller/model/LaboratoryAntibiotic.model';
import {LaboratoryAntibioticService} from 'src/app/controller/service/LaboratoryAntibiotic.service';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {DataAnalysisService} from 'src/app/controller/service/DataAnalysis.service';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {ReportService} from 'src/app/controller/service/Report.service';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {AlertService} from 'src/app/controller/service/Alert.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationService} from 'src/app/controller/service/Notification.service';
import {LocationDto} from 'src/app/controller/model/Location.model';
import {LocationService} from 'src/app/controller/service/Location.service';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {DataArchiveService} from 'src/app/controller/service/DataArchive.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
@Component({
  selector: 'app-laboratory-view-admin',
  templateUrl: './laboratory-view-admin.component.html'
})
export class LaboratoryViewAdminComponent extends AbstractViewController<LaboratoryDto, LaboratoryCriteria, LaboratoryService> implements OnInit {

    antibiotic = new AntibioticDto();
    antibiotics: Array<AntibioticDto> = [];
    alerts = new AlertDto();
    alertss: Array<AlertDto> = [];
    notifications = new NotificationDto();
    notificationss: Array<NotificationDto> = [];

    constructor(private laboratoryService: LaboratoryService, private microbiologyService: MicrobiologyService, private reportService: ReportService, private alertService: AlertService, private laboratoryService: LaboratoryService, private dataImportExportService: DataImportExportService, private notificationService: NotificationService, private locationService: LocationService, private dataArchiveService: DataArchiveService, private dataAnalysisService: DataAnalysisService, private antibioticService: AntibioticService){
        super(laboratoryService);
    }

    ngOnInit(): void {
        this.antibiotic.microbiology = new MicrobiologyDto();
        this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
        this.location = new LocationDto();
        this.locationService.findAll().subscribe((data) => this.locations = data);
        this.dataImportExport = new DataImportExportDto();
        this.dataImportExportService.findAll().subscribe((data) => this.dataImportExports = data);
        this.dataanalysis = new DataanalysisDto();
        this.dataanalysisService.findAll().subscribe((data) => this.dataanalysiss = data);
        this.dataarchive = new DataarchiveDto();
        this.dataarchiveService.findAll().subscribe((data) => this.dataarchives = data);
        this.report = new ReportDto();
        this.reportService.findAll().subscribe((data) => this.reports = data);
    }


    get dataanalysis(): DataAnalysisDto {
       return this.dataAnalysisService.item;
    }
    set dataanalysis(value: DataAnalysisDto) {
        this.dataAnalysisService.item = value;
    }
    get dataanalysiss():Array<DataAnalysisDto> {
       return this.dataAnalysisService.items;
    }
    set dataanalysiss(value: Array<DataAnalysisDto>) {
        this.dataAnalysisService.items = value;
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
    get dataarchive(): DataArchiveDto {
       return this.dataArchiveService.item;
    }
    set dataarchive(value: DataArchiveDto) {
        this.dataArchiveService.item = value;
    }
    get dataarchives():Array<DataArchiveDto> {
       return this.dataArchiveService.items;
    }
    set dataarchives(value: Array<DataArchiveDto>) {
        this.dataArchiveService.items = value;
    }
    get location(): LocationDto {
       return this.locationService.item;
    }
    set location(value: LocationDto) {
        this.locationService.item = value;
    }
    get locations():Array<LocationDto> {
       return this.locationService.items;
    }
    set locations(value: Array<LocationDto>) {
        this.locationService.items = value;
    }
    get report(): ReportDto {
       return this.reportService.item;
    }
    set report(value: ReportDto) {
        this.reportService.item = value;
    }
    get reports():Array<ReportDto> {
       return this.reportService.items;
    }
    set reports(value: Array<ReportDto>) {
        this.reportService.items = value;
    }


}
