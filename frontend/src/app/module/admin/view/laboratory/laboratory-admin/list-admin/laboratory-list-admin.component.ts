import {Component, OnInit} from '@angular/core';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryCriteria} from 'src/app/controller/criteria/LaboratoryCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LocationService } from 'src/app/controller/service/Location.service';
import { DataAnalysisService } from 'src/app/controller/service/DataAnalysis.service';
import { DataArchiveService } from 'src/app/controller/service/DataArchive.service';
import { ReportService } from 'src/app/controller/service/Report.service';

import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {LaboratoryAntibioticDto} from 'src/app/controller/model/LaboratoryAntibiotic.model';
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
    dataAnalysiss :Array<DataAnalysisDto>;
    dataArchives :Array<DataArchiveDto>;
    reports :Array<ReportDto>;
  
    constructor(laboratoryService: LaboratoryService, private locationService: LocationService, private dataAnalysisService: DataAnalysisService, private dataArchiveService: DataArchiveService, private reportService: ReportService) {
        super(laboratoryService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLocation();
      this.loadDataAnalysis();
      this.loadDataArchive();
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
            {field: 'dataAnalysis?.code', header: 'Data analysis'},
            {field: 'dataArchive?.code', header: 'Data archive'},
            {field: 'report?.code', header: 'Report'},
        ];
    }


    public async loadLocation(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.locationService.findAllOptimized().subscribe(locations => this.locations = locations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataAnalysis(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.dataAnalysisService.findAllOptimized().subscribe(dataAnalysiss => this.dataAnalysiss = dataAnalysiss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataArchive(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.dataArchiveService.findAllOptimized().subscribe(dataArchives => this.dataArchives = dataArchives,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadReport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Laboratory', 'list');
        isPermistted ? this.reportService.findAllOptimized().subscribe(reports => this.reports = reports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: LaboratoryDto) {
        if (res.laboratoryAntibiotics != null) {
             res.laboratoryAntibiotics.forEach(d => { d.laboratory = null; d.id = null; });
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
                'Data analysis': e.dataAnalysis?.code ,
                'Data archive': e.dataArchive?.code ,
                'Report': e.report?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Bloqued': this.criteria.bloqued ? (this.criteria.bloqued ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
            'City': this.criteria.city ? this.criteria.city : environment.emptyForExport ,
        //'Location': this.criteria.location?.code ? this.criteria.location?.code : environment.emptyForExport ,
        //'Data analysis': this.criteria.dataAnalysis?.code ? this.criteria.dataAnalysis?.code : environment.emptyForExport ,
        //'Data archive': this.criteria.dataArchive?.code ? this.criteria.dataArchive?.code : environment.emptyForExport ,
        //'Report': this.criteria.report?.code ? this.criteria.report?.code : environment.emptyForExport ,
        }];
      }
}
