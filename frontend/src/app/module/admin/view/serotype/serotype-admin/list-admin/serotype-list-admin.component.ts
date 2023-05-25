import {Component, OnInit} from '@angular/core';
import {SerotypeService} from 'src/app/controller/service/Serotype.service';
import {SerotypeDto} from 'src/app/controller/model/Serotype.model';
import {SerotypeCriteria} from 'src/app/controller/criteria/SerotypeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-serotype-list-admin',
  templateUrl: './serotype-list-admin.component.html'
})
export class SerotypeListAdminComponent extends AbstractListController<SerotypeDto, SerotypeCriteria, SerotypeService>  implements OnInit {

    fileName = 'Serotype';

  
    constructor(serotypeService: SerotypeService) {
        super(serotypeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadSerotypes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Serotype', 'list');
        isPermistted ? this.service.findAll().subscribe(serotypes => this.items = serotypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: SerotypeDto) {
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
