import {Component, OnInit} from '@angular/core';
import {SpecimenService} from 'src/app/controller/service/Specimen.service';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';
import {SpecimenCriteria} from 'src/app/controller/criteria/SpecimenCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { ReasonService } from 'src/app/controller/service/Reason.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';

import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {ReasonDto} from 'src/app/controller/model/Reason.model';


@Component({
  selector: 'app-specimen-list-admin',
  templateUrl: './specimen-list-admin.component.html'
})
export class SpecimenListAdminComponent extends AbstractListController<SpecimenDto, SpecimenCriteria, SpecimenService>  implements OnInit {

    fileName = 'Specimen';

    reasons :Array<ReasonDto>;
    dataImportExports :Array<DataImportExportDto>;
  
    constructor(specimenService: SpecimenService, private reasonService: ReasonService, private dataImportExportService: DataImportExportService) {
        super(specimenService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadReason();
      this.loadDataImportExport();
    }

    public async loadSpecimens(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Specimen', 'list');
        isPermistted ? this.service.findAll().subscribe(specimens => this.items = specimens,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'date', header: 'Date'},
            {field: 'type', header: 'Type'},
            {field: 'reason?.libelle', header: 'Reason'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
        ];
    }


    public async loadReason(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Specimen', 'list');
        isPermistted ? this.reasonService.findAllOptimized().subscribe(reasons => this.reasons = reasons,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Specimen', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: SpecimenDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Date': this.datePipe.transform(e.date , 'dd/MM/yyyy hh:mm'),
                 'Type': e.type ,
                'Reason': e.reason?.libelle ,
                'Data import export': e.dataImportExport?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Date Min': this.criteria.dateFrom ? this.datePipe.transform(this.criteria.dateFrom , this.dateFormat) : environment.emptyForExport ,
            'Date Max': this.criteria.dateTo ? this.datePipe.transform(this.criteria.dateTo , this.dateFormat) : environment.emptyForExport ,
            'Type': this.criteria.type ? this.criteria.type : environment.emptyForExport ,
        //'Reason': this.criteria.reason?.libelle ? this.criteria.reason?.libelle : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        }];
      }
}
