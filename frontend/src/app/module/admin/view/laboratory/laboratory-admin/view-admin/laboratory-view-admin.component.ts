import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryCriteria} from 'src/app/controller/criteria/LaboratoryCriteria.model';

import {LocationDto} from 'src/app/controller/model/Location.model';
import {LocationService} from 'src/app/controller/service/Location.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationService} from 'src/app/controller/service/Notification.service';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {AlertService} from 'src/app/controller/service/Alert.service';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {DataArchiveService} from 'src/app/controller/service/DataArchive.service';
import {LaboratoryAntibioticDto} from 'src/app/controller/model/LaboratoryAntibiotic.model';
import {LaboratoryAntibioticService} from 'src/app/controller/service/LaboratoryAntibiotic.service';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {DataAnalysisService} from 'src/app/controller/service/DataAnalysis.service';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {ReportService} from 'src/app/controller/service/Report.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
@Component({
  selector: 'app-laboratory-view-admin',
  templateUrl: './laboratory-view-admin.component.html'
})
export class LaboratoryViewAdminComponent extends AbstractViewController<LaboratoryDto, LaboratoryCriteria, LaboratoryService> implements OnInit {

    laboratoryAntibiotics = new LaboratoryAntibioticDto();
    laboratoryAntibioticss: Array<LaboratoryAntibioticDto> = [];
    alerts = new AlertDto();
    alertss: Array<AlertDto> = [];
    notifications = new NotificationDto();
    notificationss: Array<NotificationDto> = [];

    constructor(private laboratoryService: LaboratoryService, private alertService: AlertService, private dataArchiveService: DataArchiveService, private laboratoryAntibioticService: LaboratoryAntibioticService, private locationService: LocationService, private dataAnalysisService: DataAnalysisService, private notificationService: NotificationService, private reportService: ReportService, private antibioticService: AntibioticService){
        super(laboratoryService);
    }

    ngOnInit(): void {
        this.laboratoryAntibiotics.antibiotic = new AntibioticDto();
        this.antibioticService.findAll().subscribe((data) => this.antibiotics = data);
        this.location = new LocationDto();
        this.locationService.findAll().subscribe((data) => this.locations = data);
        this.dataAnalysis = new DataAnalysisDto();
        this.dataAnalysisService.findAll().subscribe((data) => this.dataAnalysiss = data);
        this.dataArchive = new DataArchiveDto();
        this.dataArchiveService.findAll().subscribe((data) => this.dataArchives = data);
        this.report = new ReportDto();
        this.reportService.findAll().subscribe((data) => this.reports = data);
    }


    get antibiotic(): AntibioticDto {
       return this.antibioticService.item;
    }
    set antibiotic(value: AntibioticDto) {
        this.antibioticService.item = value;
    }
    get antibiotics():Array<AntibioticDto> {
       return this.antibioticService.items;
    }
    set antibiotics(value: Array<AntibioticDto>) {
        this.antibioticService.items = value;
    }
    get dataAnalysis(): DataAnalysisDto {
       return this.dataAnalysisService.item;
    }
    set dataAnalysis(value: DataAnalysisDto) {
        this.dataAnalysisService.item = value;
    }
    get dataAnalysiss():Array<DataAnalysisDto> {
       return this.dataAnalysisService.items;
    }
    set dataAnalysiss(value: Array<DataAnalysisDto>) {
        this.dataAnalysisService.items = value;
    }
    get dataArchive(): DataArchiveDto {
       return this.dataArchiveService.item;
    }
    set dataArchive(value: DataArchiveDto) {
        this.dataArchiveService.item = value;
    }
    get dataArchives():Array<DataArchiveDto> {
       return this.dataArchiveService.items;
    }
    set dataArchives(value: Array<DataArchiveDto>) {
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
