import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

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
  selector: 'app-laboratory-create-admin',
  templateUrl: './laboratory-create-admin.component.html'
})
export class LaboratoryCreateAdminComponent extends AbstractCreateController<LaboratoryDto, LaboratoryCriteria, LaboratoryService>  implements OnInit {

    private _antibioticElement = new AntibioticDto();
    private _alertsElement = new AlertDto();
    private _notificationsElement = new NotificationDto();


   private _validLaboratoryCode = true;
    private _validAntibioticCode = true;
    private _validLocationCode = true;
    private _validDataImportExportCode = true;
    private _validAlertsCode = true;
    private _validNotificationsCode = true;
    private _validDataanalysisCode = true;
    private _validDataarchiveCode = true;
    private _validReportCode = true;
    private _laboratoryAntibiotics: Array<LaboratoryAntibioticDto> = [];

    constructor( private laboratoryService: LaboratoryService , private microbiologyService: MicrobiologyService, private reportService: ReportService, private alertService: AlertService, private laboratoryService: LaboratoryService, private dataImportExportService: DataImportExportService, private notificationService: NotificationService, private locationService: LocationService, private dataArchiveService: DataArchiveService, private dataAnalysisService: DataAnalysisService, private antibioticService: AntibioticService) {
        super(laboratoryService);
    }

    ngOnInit(): void {
        this.antibioticElement.microbiology = new MicrobiologyDto();
        this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
         this.laboratoryService.findAll().subscribe(data => this.prepareLaboratoryAntibiotics(data));
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


   prepareLaboratoryAntibiotics(laboratorys: Array<LaboratoryDto>): void{
        if( laboratorys != null){
            laboratorys.forEach(e => {
            const laboratoryAntibiotic = new LaboratoryAntibioticDto();
            laboratoryAntibiotic.laboratory = e;
            this.laboratoryAntibiotics.push(laboratoryAntibiotic);
            });
        }
   }

    validateAntibiotic(){
        this.errorMessages = new Array();
        this.validateAntibioticCode();
    }
    validateAlerts(){
        this.errorMessages = new Array();
        this.validateAlertsCode();
    }
    validateNotifications(){
        this.errorMessages = new Array();
        this.validateNotificationsCode();
    }


    public setValidation(value: boolean){
        this.validLaboratoryCode = value;
        this.validAntibioticCode = value;
        this.validAlertsCode = value;
        this.validNotificationsCode = value;
    }

    public addAntibiotic() {
        if( this.item.antibiotic == null )
            this.item.antibiotic = new Array<AntibioticDto>();
       this.validateAntibiotic();
       if (this.errorMessages.length === 0) {
              this.item.antibiotic.push({... this.antibioticElement});
              this.antibioticElement = new AntibioticDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteAntibiotic(p: AntibioticDto) {
        this.item.antibiotic.forEach((element, index) => {
            if (element === p) { this.item.antibiotic.splice(index, 1); }
        });
    }

    public editAntibiotic(p: AntibioticDto) {
        this.antibioticElement = {... p};
        this.activeTab = 0;
    }
    public addAlerts() {
        if( this.item.alerts == null )
            this.item.alerts = new Array<AlertDto>();
       this.validateAlerts();
       if (this.errorMessages.length === 0) {
              this.item.alerts.push({... this.alertsElement});
              this.alertsElement = new AlertDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteAlert(p: AlertDto) {
        this.item.alerts.forEach((element, index) => {
            if (element === p) { this.item.alerts.splice(index, 1); }
        });
    }

    public editAlert(p: AlertDto) {
        this.alertsElement = {... p};
        this.activeTab = 0;
    }
    public addNotifications() {
        if( this.item.notifications == null )
            this.item.notifications = new Array<NotificationDto>();
       this.validateNotifications();
       if (this.errorMessages.length === 0) {
              this.item.notifications.push({... this.notificationsElement});
              this.notificationsElement = new NotificationDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteNotification(p: NotificationDto) {
        this.item.notifications.forEach((element, index) => {
            if (element === p) { this.item.notifications.splice(index, 1); }
        });
    }

    public editNotification(p: NotificationDto) {
        this.notificationsElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateLaboratoryCode();
    }

    public validateLaboratoryCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validLaboratoryCode = false;
        } else {
            this.validLaboratoryCode = true;
        }
    }

    public validateAntibioticCode(){
        if (this.antibioticElement.code == null) {
            this.errorMessages.push('Code de la antibiotic est  invalide');
            this.validAntibioticCode = false;
        } else {
            this.validAntibioticCode = true;
        }
    }
    public validateAlertsCode(){
        if (this.alertsElement.code == null) {
            this.errorMessages.push('Code de la alert est  invalide');
            this.validAlertsCode = false;
        } else {
            this.validAlertsCode = true;
        }
    }
    public validateNotificationsCode(){
        if (this.notificationsElement.code == null) {
            this.errorMessages.push('Code de la notification est  invalide');
            this.validNotificationsCode = false;
        } else {
            this.validNotificationsCode = true;
        }
    }


    get dataanalysis(): DataAnalysisDto {
        return this.dataAnalysisService.item;
    }
    set dataanalysis(value: DataAnalysisDto) {
        this.dataAnalysisService.item = value;
    }
    get dataanalysiss(): Array<DataAnalysisDto> {
        return this.dataAnalysisService.items;
    }
    set dataanalysiss(value: Array<DataAnalysisDto>) {
        this.dataAnalysisService.items = value;
    }
    get createDataanalysisDialog(): boolean {
       return this.dataAnalysisService.createDialog;
    }
    set createDataanalysisDialog(value: boolean) {
        this.dataAnalysisService.createDialog= value;
    }
    get dataImportExport(): DataImportExportDto {
        return this.dataImportExportService.item;
    }
    set dataImportExport(value: DataImportExportDto) {
        this.dataImportExportService.item = value;
    }
    get dataImportExports(): Array<DataImportExportDto> {
        return this.dataImportExportService.items;
    }
    set dataImportExports(value: Array<DataImportExportDto>) {
        this.dataImportExportService.items = value;
    }
    get createDataImportExportDialog(): boolean {
       return this.dataImportExportService.createDialog;
    }
    set createDataImportExportDialog(value: boolean) {
        this.dataImportExportService.createDialog= value;
    }
    get microbiology(): MicrobiologyDto {
        return this.microbiologyService.item;
    }
    set microbiology(value: MicrobiologyDto) {
        this.microbiologyService.item = value;
    }
    get microbiologys(): Array<MicrobiologyDto> {
        return this.microbiologyService.items;
    }
    set microbiologys(value: Array<MicrobiologyDto>) {
        this.microbiologyService.items = value;
    }
    get createMicrobiologyDialog(): boolean {
       return this.microbiologyService.createDialog;
    }
    set createMicrobiologyDialog(value: boolean) {
        this.microbiologyService.createDialog= value;
    }
    get dataarchive(): DataArchiveDto {
        return this.dataArchiveService.item;
    }
    set dataarchive(value: DataArchiveDto) {
        this.dataArchiveService.item = value;
    }
    get dataarchives(): Array<DataArchiveDto> {
        return this.dataArchiveService.items;
    }
    set dataarchives(value: Array<DataArchiveDto>) {
        this.dataArchiveService.items = value;
    }
    get createDataarchiveDialog(): boolean {
       return this.dataArchiveService.createDialog;
    }
    set createDataarchiveDialog(value: boolean) {
        this.dataArchiveService.createDialog= value;
    }
    get location(): LocationDto {
        return this.locationService.item;
    }
    set location(value: LocationDto) {
        this.locationService.item = value;
    }
    get locations(): Array<LocationDto> {
        return this.locationService.items;
    }
    set locations(value: Array<LocationDto>) {
        this.locationService.items = value;
    }
    get createLocationDialog(): boolean {
       return this.locationService.createDialog;
    }
    set createLocationDialog(value: boolean) {
        this.locationService.createDialog= value;
    }
    get report(): ReportDto {
        return this.reportService.item;
    }
    set report(value: ReportDto) {
        this.reportService.item = value;
    }
    get reports(): Array<ReportDto> {
        return this.reportService.items;
    }
    set reports(value: Array<ReportDto>) {
        this.reportService.items = value;
    }
    get createReportDialog(): boolean {
       return this.reportService.createDialog;
    }
    set createReportDialog(value: boolean) {
        this.reportService.createDialog= value;
    }


    get laboratoryAntibiotics(): Array<LaboratoryAntibioticDto> {
        if( this._laboratoryAntibiotics == null )
            this._laboratoryAntibiotics = new Array();
        return this._laboratoryAntibiotics;
    }

    set laboratoryAntibiotics(value: Array<LaboratoryAntibioticDto>) {
        this._laboratoryAntibiotics = value;
    }

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }

    set validLaboratoryCode(value: boolean) {
         this._validLaboratoryCode = value;
    }

    get validAntibioticCode(): boolean {
        return this._validAntibioticCode;
    }
    set validAntibioticCode(value: boolean) {
        this._validAntibioticCode = value;
    }
    get validLocationCode(): boolean {
        return this._validLocationCode;
    }
    set validLocationCode(value: boolean) {
        this._validLocationCode = value;
    }
    get validDataImportExportCode(): boolean {
        return this._validDataImportExportCode;
    }
    set validDataImportExportCode(value: boolean) {
        this._validDataImportExportCode = value;
    }
    get validAlertsCode(): boolean {
        return this._validAlertsCode;
    }
    set validAlertsCode(value: boolean) {
        this._validAlertsCode = value;
    }
    get validNotificationsCode(): boolean {
        return this._validNotificationsCode;
    }
    set validNotificationsCode(value: boolean) {
        this._validNotificationsCode = value;
    }
    get validDataanalysisCode(): boolean {
        return this._validDataanalysisCode;
    }
    set validDataanalysisCode(value: boolean) {
        this._validDataanalysisCode = value;
    }
    get validDataarchiveCode(): boolean {
        return this._validDataarchiveCode;
    }
    set validDataarchiveCode(value: boolean) {
        this._validDataarchiveCode = value;
    }
    get validReportCode(): boolean {
        return this._validReportCode;
    }
    set validReportCode(value: boolean) {
        this._validReportCode = value;
    }

    get antibioticElement(): AntibioticDto {
        if( this._antibioticElement == null )
            this._antibioticElement = new AntibioticDto();
        return this._antibioticElement;
    }

    set antibioticElement(value: AntibioticDto) {
        this._antibioticElement = value;
    }
    get alertsElement(): AlertDto {
        if( this._alertsElement == null )
            this._alertsElement = new AlertDto();
        return this._alertsElement;
    }

    set alertsElement(value: AlertDto) {
        this._alertsElement = value;
    }
    get notificationsElement(): NotificationDto {
        if( this._notificationsElement == null )
            this._notificationsElement = new NotificationDto();
        return this._notificationsElement;
    }

    set notificationsElement(value: NotificationDto) {
        this._notificationsElement = value;
    }

}
