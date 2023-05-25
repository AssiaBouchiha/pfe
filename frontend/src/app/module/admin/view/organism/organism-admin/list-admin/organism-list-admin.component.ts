import {Component, OnInit} from '@angular/core';
import {OrganismService} from 'src/app/controller/service/Organism.service';
import {OrganismDto} from 'src/app/controller/model/Organism.model';
import {OrganismCriteria} from 'src/app/controller/criteria/OrganismCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-organism-list-admin',
  templateUrl: './organism-list-admin.component.html'
})
export class OrganismListAdminComponent extends AbstractListController<OrganismDto, OrganismCriteria, OrganismService>  implements OnInit {

    fileName = 'Organism';

  
    constructor(organismService: OrganismService) {
        super(organismService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadOrganisms(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Organism', 'list');
        isPermistted ? this.service.findAll().subscribe(organisms => this.items = organisms,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: OrganismDto) {
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
