import {Component, OnInit} from '@angular/core';
import {GenderService} from 'src/app/controller/service/Gender.service';
import {GenderDto} from 'src/app/controller/model/Gender.model';
import {GenderCriteria} from 'src/app/controller/criteria/GenderCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-gender-list-admin',
  templateUrl: './gender-list-admin.component.html'
})
export class GenderListAdminComponent extends AbstractListController<GenderDto, GenderCriteria, GenderService>  implements OnInit {

    fileName = 'Gender';

  
    constructor(genderService: GenderService) {
        super(genderService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadGenders(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Gender', 'list');
        isPermistted ? this.service.findAll().subscribe(genders => this.items = genders,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: GenderDto) {
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
