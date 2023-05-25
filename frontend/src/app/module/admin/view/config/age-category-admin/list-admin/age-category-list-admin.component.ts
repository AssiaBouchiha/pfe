import {Component, OnInit} from '@angular/core';
import {AgeCategoryService} from 'src/app/controller/service/AgeCategory.service';
import {AgeCategoryDto} from 'src/app/controller/model/AgeCategory.model';
import {AgeCategoryCriteria} from 'src/app/controller/criteria/AgeCategoryCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-age-category-list-admin',
  templateUrl: './age-category-list-admin.component.html'
})
export class AgeCategoryListAdminComponent extends AbstractListController<AgeCategoryDto, AgeCategoryCriteria, AgeCategoryService>  implements OnInit {

    fileName = 'AgeCategory';

  
    constructor(ageCategoryService: AgeCategoryService) {
        super(ageCategoryService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadAgeCategorys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('AgeCategory', 'list');
        isPermistted ? this.service.findAll().subscribe(ageCategorys => this.items = ageCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: AgeCategoryDto) {
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
