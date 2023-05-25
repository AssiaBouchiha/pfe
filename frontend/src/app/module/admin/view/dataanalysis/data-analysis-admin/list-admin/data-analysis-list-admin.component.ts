import {Component, OnInit} from '@angular/core';
import {DataAnalysisService} from 'src/app/controller/service/DataAnalysis.service';
import {DataAnalysisDto} from 'src/app/controller/model/DataAnalysis.model';
import {DataAnalysisCriteria} from 'src/app/controller/criteria/DataAnalysisCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';


@Component({
  selector: 'app-data-analysis-list-admin',
  templateUrl: './data-analysis-list-admin.component.html'
})
export class DataAnalysisListAdminComponent extends AbstractListController<DataAnalysisDto, DataAnalysisCriteria, DataAnalysisService>  implements OnInit {

    fileName = 'DataAnalysis';

    laboratorys :Array<LaboratoryDto>;
  
    constructor(dataAnalysisService: DataAnalysisService, private laboratoryService: LaboratoryService) {
        super(dataAnalysisService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLaboratory();
    }

    public async loadDataAnalysiss(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataAnalysis', 'list');
        isPermistted ? this.service.findAll().subscribe(dataAnalysiss => this.items = dataAnalysiss,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'format', header: 'Format'},
            {field: 'laboratory?.code', header: 'Laboratory'},
        ];
    }


    public async loadLaboratory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataAnalysis', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: DataAnalysisDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Format': e.format ,
                'Laboratory': e.laboratory?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Format': this.criteria.format ? this.criteria.format : environment.emptyForExport ,
        //'Laboratory': this.criteria.laboratory?.code ? this.criteria.laboratory?.code : environment.emptyForExport ,
        }];
      }
}
