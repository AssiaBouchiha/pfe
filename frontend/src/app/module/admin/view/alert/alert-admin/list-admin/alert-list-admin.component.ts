import {Component, OnInit} from '@angular/core';
import {AlertService} from 'src/app/controller/service/Alert.service';
import {AlertDto} from 'src/app/controller/model/Alert.model';
import {AlertCriteria} from 'src/app/controller/criteria/AlertCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';


@Component({
  selector: 'app-alert-list-admin',
  templateUrl: './alert-list-admin.component.html'
})
export class AlertListAdminComponent extends AbstractListController<AlertDto, AlertCriteria, AlertService>  implements OnInit {

    fileName = 'Alert';

    laboratorys :Array<LaboratoryDto>;
  
    constructor(alertService: AlertService, private laboratoryService: LaboratoryService) {
        super(alertService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLaboratory();
    }

    public async loadAlerts(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Alert', 'list');
        isPermistted ? this.service.findAll().subscribe(alerts => this.items = alerts,error=>console.log(error))
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
        const isPermistted = await this.roleService.isPermitted('Alert', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: AlertDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Description': e.description ,
                 'Nom': e.nom ,
                'Laboratory': e.laboratory?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
        //'Laboratory': this.criteria.laboratory?.code ? this.criteria.laboratory?.code : environment.emptyForExport ,
        }];
      }
}
