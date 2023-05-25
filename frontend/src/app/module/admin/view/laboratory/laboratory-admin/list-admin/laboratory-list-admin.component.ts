import {Component, OnInit} from '@angular/core';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryCriteria} from 'src/app/controller/criteria/LaboratoryCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LocationService } from 'src/app/controller/service/Location.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';
import { DataAnalysisService } from 'src/app/controller/service/DataAnalysis.service';
import { DataArchiveService } from 'src/app/controller/service/DataArchive.service';
import { ReportService } from 'src/app/controller/service/Report.service';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {LocationDto} from 'src/app/controller/model/Location.model';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {NotificationDto} from 'src/app/controller/model/Notification.model';


@Component({
  selector: 'app-laboratory-list-admin',
  templateUrl: './laboratory-list-admin.component.html'
})
export class LaboratoryListAdminComponent extends AbstractListController<LaboratoryDto, LaboratoryCriteria, LaboratoryService>  implements OnInit {

    fileName = 'Laboratory';

     yesOrNoBloqued :any[] =[];
    locations :Array<LocationDto>;
    dataImportExports :Array<DataImportExportDto>;
    dataanalysiss :Array<DataAnalysisDto>;
    dataarchives :Array<DataArchiveDto>;
    reports :Array<ReportDto>;
  
    constructor(laboratoryService: LaboratoryService, private locationService: LocationService, private dataImportExportService: DataImportExportService, private dataAnalysisService: DataAnalysisService, private dataArchiveService: DataArchiveService, private reportService: ReportService) {
        super(laboratoryService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLocation();
      this.loadDataImportExport();
      this.loadDataanalysis();
      this.loadDataarchive();
      this.loadReport();
    this.yesOrNoBloqued =  [{label: 'Bloqued', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }

    public async loadLaboratorys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.service.findAll().subscribe(laboratorys => this.items = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'nom', header: 'Nom'},
            {field: 'bloqued', header: 'Bloqued'},
            {field: 'city', header: 'City'},
            {field: 'location?.code', header: 'Location'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
            {field: 'dataanalysis?.code', header: 'Dataanalysis'},
            {field: 'dataarchive?.code', header: 'Dataarchive'},
            {field: 'report?.code', header: 'Report'},
        ];
    }


    public async loadLocation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.locationService.findAllOptimized().subscribe(locations => this.locations = locations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataanalysis(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.dataAnalysisService.findAllOptimized().subscribe(dataanalysiss => this.dataanalysiss = dataanalysiss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataarchive(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.dataArchiveService.findAllOptimized().subscribe(dataarchives => this.dataarchives = dataarchives,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadReport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.reportService.findAllOptimized().subscribe(reports => this.reports = reports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: LaboratoryDto) {
        if (res.antibiotic != null) {
             res.antibiotic.forEach(d => { d.laboratory = null; d.id = null; });
        }
        if (res.alerts != null) {
             res.alerts.forEach(d => { d.laboratory = null; d.id = null; });
        }
        if (res.notifications != null) {
             res.notifications.forEach(d => { d.laboratory = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Nom': e.nom ,
                'Bloqued': e.bloqued? 'Vrai' : 'Faux' ,
                 'City': e.city ,
                'Location': e.location?.code ,
                'Data import export': e.dataImportExport?.code ,
                'Dataanalysis': e.dataanalysis?.code ,
                'Dataarchive': e.dataarchive?.code ,
                'Report': e.report?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Bloqued': this.criteria.bloqued ? (this.criteria.bloqued ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'City': this.criteria.city ? this.criteria.city : environment.emptyForExport ,
        //'Location': this.criteria.location?.code ? this.criteria.location?.code : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        //'Dataanalysis': this.criteria.dataanalysis?.code ? this.criteria.dataanalysis?.code : environment.emptyForExport ,
        //'Dataarchive': this.criteria.dataarchive?.code ? this.criteria.dataarchive?.code : environment.emptyForExport ,
        //'Report': this.criteria.report?.code ? this.criteria.report?.code : environment.emptyForExport ,
        }];
      }
}
