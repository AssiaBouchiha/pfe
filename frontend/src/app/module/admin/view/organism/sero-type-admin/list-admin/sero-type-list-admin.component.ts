import {Component, OnInit} from '@angular/core';
import {SeroTypeService} from 'src/app/controller/service/SeroType.service';
import {SeroTypeDto} from 'src/app/controller/model/SeroType.model';
import {SeroTypeCriteria} from 'src/app/controller/criteria/SeroTypeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-sero-type-list-admin',
  templateUrl: './sero-type-list-admin.component.html'
})
export class SeroTypeListAdminComponent extends AbstractListController<SeroTypeDto, SeroTypeCriteria, SeroTypeService>  implements OnInit {

    fileName = 'SeroType';

  
    constructor(seroTypeService: SeroTypeService) {
        super(seroTypeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSeroTypes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('SeroType', 'list');
        isPermistted ? this.service.findAll().subscribe(seroTypes => this.items = seroTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: SeroTypeDto) {
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
