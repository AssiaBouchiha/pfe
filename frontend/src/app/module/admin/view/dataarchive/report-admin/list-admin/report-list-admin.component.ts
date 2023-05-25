import {Component, OnInit} from '@angular/core';
import {ReportService} from 'src/app/controller/service/Report.service';
import {ReportDto} from 'src/app/controller/model/Report.model';
import {ReportCriteria} from 'src/app/controller/criteria/ReportCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';


@Component({
  selector: 'app-report-list-admin',
  templateUrl: './report-list-admin.component.html'
})
export class ReportListAdminComponent extends AbstractListController<ReportDto, ReportCriteria, ReportService>  implements OnInit {

    fileName = 'Report';

    laboratorys :Array<LaboratoryDto>;
  
    constructor(reportService: ReportService, private laboratoryService: LaboratoryService) {
        super(reportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLaboratory();
    }

    public async loadReports(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Report', 'list');
        isPermistted ? this.service.findAll().subscribe(reports => this.items = reports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'nom', header: 'Nom'},
            {field: 'laboratory?.code', header: 'Laboratory'},
        ];
    }


    public async loadLaboratory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Report', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: ReportDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Nom': e.nom ,
                'Laboratory': e.laboratory?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
        //'Laboratory': this.criteria.laboratory?.code ? this.criteria.laboratory?.code : environment.emptyForExport ,
        }];
      }
}
