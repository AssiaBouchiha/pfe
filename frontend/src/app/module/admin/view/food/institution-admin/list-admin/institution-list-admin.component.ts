import {Component, OnInit} from '@angular/core';
import {InstitutionService} from 'src/app/controller/service/Institution.service';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {InstitutionCriteria} from 'src/app/controller/criteria/InstitutionCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-institution-list-admin',
  templateUrl: './institution-list-admin.component.html'
})
export class InstitutionListAdminComponent extends AbstractListController<InstitutionDto, InstitutionCriteria, InstitutionService>  implements OnInit {

    fileName = 'Institution';

  
    constructor(institutionService: InstitutionService) {
        super(institutionService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadInstitutions(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Institution', 'list');
        isPermistted ? this.service.findAll().subscribe(institutions => this.items = institutions,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: InstitutionDto) {
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
