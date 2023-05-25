import {Component, OnInit} from '@angular/core';
import {NotificationService} from 'src/app/controller/service/Notification.service';
import {NotificationDto} from 'src/app/controller/model/Notification.model';
import {NotificationCriteria} from 'src/app/controller/criteria/NotificationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';


@Component({
  selector: 'app-notification-list-admin',
  templateUrl: './notification-list-admin.component.html'
})
export class NotificationListAdminComponent extends AbstractListController<NotificationDto, NotificationCriteria, NotificationService>  implements OnInit {

    fileName = 'Notification';

    laboratorys :Array<LaboratoryDto>;
  
    constructor(notificationService: NotificationService, private laboratoryService: LaboratoryService) {
        super(notificationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLaboratory();
    }

    public async loadNotifications(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Notification', 'list');
        isPermistted ? this.service.findAll().subscribe(notifications => this.items = notifications,error=>console.log(error))
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
        const isPermistted = await this.roleService.isPermitted('Notification', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: NotificationDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Nom': e.nom ,
                 'Description': e.description ,
                'Laboratory': e.laboratory?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        //'Laboratory': this.criteria.laboratory?.code ? this.criteria.laboratory?.code : environment.emptyForExport ,
        }];
      }
}
