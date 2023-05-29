import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

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
  selector: 'app-laboratory-edit-admin',
  templateUrl: './laboratory-edit-admin.component.html'
})
export class LaboratoryEditAdminComponent extends AbstractEditController<LaboratoryDto, LaboratoryCriteria, LaboratoryService>   implements OnInit {

    private _laboratoryAntibioticsElement = new LaboratoryAntibioticDto();
    private _alertsElement = new AlertDto();
    private _notificationsElement = new NotificationDto();

    private _validLaboratoryCode = true;

    private _validLocationCode = true;
    private _validAlertsCode = true;
    private _validNotificationsCode = true;
    private _validDataAnalysisCode = true;
    private _validDataArchiveCode = true;
    private _validReportCode = true;


    private _laboratoryAntibiotics: Array<LaboratoryAntibioticDto> = [];

    constructor( private laboratoryService: LaboratoryService , private alertService: AlertService, private dataArchiveService: DataArchiveService, private laboratoryAntibioticService: LaboratoryAntibioticService, private locationService: LocationService, private dataAnalysisService: DataAnalysisService, private notificationService: NotificationService, private reportService: ReportService, private antibioticService: AntibioticService) {
        super(laboratoryService);
    }

    ngOnInit(): void {
        this.antibioticService.findAll().subscribe(data => this.prepareLaboratoryAntibiotics(data));
        this.laboratoryAntibioticsElement.antibiotic = new AntibioticDto();
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


    prepareLaboratoryAntibiotics(antibiotics: Array<AntibioticDto>): void{
        if( antibiotics != null){
            antibiotics.forEach(e => {
                const laboratoryAntibiotic = new LaboratoryAntibioticDto();
                laboratoryAntibiotic.antibiotic = e;
                this.laboratoryAntibiotics.push(laboratoryAntibiotic);
            });
        }
    }
    public validateAlerts(){
        this.errorMessages = new Array();
        this.validateAlertsCode();
    }
    public validateNotifications(){
        this.errorMessages = new Array();
        this.validateNotificationsCode();
    }
    public setValidation(value : boolean){
        this.validLaboratoryCode = value;
        this.validAlertsCode = value;
        this.validNotificationsCode = value;
        }
   public addAlerts() {
        if( this.item.alerts == null )
            this.item.alerts = new Array<AlertDto>();
       this.validateAlerts();
       if (this.errorMessages.length === 0) {
            if(this.alertsElement.id == null){
                this.item.alerts.push(this.alertsElement);
            }else{
                const index = this.item.alerts.findIndex(e => e.id == this.alertsElement.id);
                this.item.alerts[index] = this.alertsElement;
            }
          this.alertsElement = new AlertDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs', detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
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
            if(this.notificationsElement.id == null){
                this.item.notifications.push(this.notificationsElement);
            }else{
                const index = this.item.notifications.findIndex(e => e.id == this.notificationsElement.id);
                this.item.notifications[index] = this.notificationsElement;
            }
          this.notificationsElement = new NotificationDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs', detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
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


    private validateAlertsCode(){
        if (this.alertsElement.code == null) {
        this.errorMessages.push('Code de la alert est  invalide');
            this.validAlertsCode = false;
        } else {
            this.validAlertsCode = true;
        }
    }
    private validateNotificationsCode(){
        if (this.notificationsElement.code == null) {
        this.errorMessages.push('Code de la notification est  invalide');
            this.validNotificationsCode = false;
        } else {
            this.validNotificationsCode = true;
        }
    }


   get antibiotic(): AntibioticDto {
       return this.antibioticService.item;
   }
  set antibiotic(value: AntibioticDto) {
        this.antibioticService.item = value;
   }
   get antibiotics(): Array<AntibioticDto> {
        return this.antibioticService.items;
   }
   set antibiotics(value: Array<AntibioticDto>) {
        this.antibioticService.items = value;
   }
   get createAntibioticDialog(): boolean {
       return this.antibioticService.createDialog;
   }
  set createAntibioticDialog(value: boolean) {
       this.antibioticService.createDialog= value;
   }
   get dataAnalysis(): DataAnalysisDto {
       return this.dataAnalysisService.item;
   }
  set dataAnalysis(value: DataAnalysisDto) {
        this.dataAnalysisService.item = value;
   }
   get dataAnalysiss(): Array<DataAnalysisDto> {
        return this.dataAnalysisService.items;
   }
   set dataAnalysiss(value: Array<DataAnalysisDto>) {
        this.dataAnalysisService.items = value;
   }
   get createDataAnalysisDialog(): boolean {
       return this.dataAnalysisService.createDialog;
   }
  set createDataAnalysisDialog(value: boolean) {
       this.dataAnalysisService.createDialog= value;
   }
   get dataArchive(): DataArchiveDto {
       return this.dataArchiveService.item;
   }
  set dataArchive(value: DataArchiveDto) {
        this.dataArchiveService.item = value;
   }
   get dataArchives(): Array<DataArchiveDto> {
        return this.dataArchiveService.items;
   }
   set dataArchives(value: Array<DataArchiveDto>) {
        this.dataArchiveService.items = value;
   }
   get createDataArchiveDialog(): boolean {
       return this.dataArchiveService.createDialog;
   }
  set createDataArchiveDialog(value: boolean) {
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
    get laboratoryAntibioticsElement(): LaboratoryAntibioticDto {
        if( this._laboratoryAntibioticsElement == null )
            this._laboratoryAntibioticsElement = new LaboratoryAntibioticDto();
         return this._laboratoryAntibioticsElement;
    }

    set laboratoryAntibioticsElement(value: LaboratoryAntibioticDto) {
        this._laboratoryAntibioticsElement = value;
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

    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }

    get validLocationCode(): boolean {
        return this._validLocationCode;
    }
    set validLocationCode(value: boolean) {
        this._validLocationCode = value;
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
    get validDataAnalysisCode(): boolean {
        return this._validDataAnalysisCode;
    }
    set validDataAnalysisCode(value: boolean) {
        this._validDataAnalysisCode = value;
    }
    get validDataArchiveCode(): boolean {
        return this._validDataArchiveCode;
    }
    set validDataArchiveCode(value: boolean) {
        this._validDataArchiveCode = value;
    }
    get validReportCode(): boolean {
        return this._validReportCode;
    }
    set validReportCode(value: boolean) {
        this._validReportCode = value;
    }
}
