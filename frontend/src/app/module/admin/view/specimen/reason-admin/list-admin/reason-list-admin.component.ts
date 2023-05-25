import {Component, OnInit} from '@angular/core';
import {ReasonService} from 'src/app/controller/service/Reason.service';
import {ReasonDto} from 'src/app/controller/model/Reason.model';
import {ReasonCriteria} from 'src/app/controller/criteria/ReasonCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-reason-list-admin',
  templateUrl: './reason-list-admin.component.html'
})
export class ReasonListAdminComponent extends AbstractListController<ReasonDto, ReasonCriteria, ReasonService>  implements OnInit {

    fileName = 'Reason';

  
    constructor(reasonService: ReasonService) {
        super(reasonService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadReasons(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Reason', 'list');
        isPermistted ? this.service.findAll().subscribe(reasons => this.items = reasons,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: ReasonDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}
