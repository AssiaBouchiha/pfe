import {Component, OnInit} from '@angular/core';
import {DataArchiveService} from 'src/app/controller/service/DataArchive.service';
import {DataArchiveDto} from 'src/app/controller/model/DataArchive.model';
import {DataArchiveCriteria} from 'src/app/controller/criteria/DataArchiveCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';


@Component({
  selector: 'app-data-archive-list-admin',
  templateUrl: './data-archive-list-admin.component.html'
})
export class DataArchiveListAdminComponent extends AbstractListController<DataArchiveDto, DataArchiveCriteria, DataArchiveService>  implements OnInit {

    fileName = 'DataArchive';

    laboratorys :Array<LaboratoryDto>;
  
    constructor(dataArchiveService: DataArchiveService, private laboratoryService: LaboratoryService) {
        super(dataArchiveService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLaboratory();
    }

    public async loadDataArchives(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataArchive', 'list');
        isPermistted ? this.service.findAll().subscribe(dataArchives => this.items = dataArchives,error=>console.log(error))
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
        const isPermistted = await this.roleService.isPermitted('DataArchive', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: DataArchiveDto) {
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
