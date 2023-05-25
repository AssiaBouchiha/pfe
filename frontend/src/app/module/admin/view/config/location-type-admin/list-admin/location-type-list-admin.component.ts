import {Component, OnInit} from '@angular/core';
import {LocationTypeService} from 'src/app/controller/service/LocationType.service';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';
import {LocationTypeCriteria} from 'src/app/controller/criteria/LocationTypeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-location-type-list-admin',
  templateUrl: './location-type-list-admin.component.html'
})
export class LocationTypeListAdminComponent extends AbstractListController<LocationTypeDto, LocationTypeCriteria, LocationTypeService>  implements OnInit {

    fileName = 'LocationType';

  
    constructor(locationTypeService: LocationTypeService) {
        super(locationTypeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadLocationTypes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('LocationType', 'list');
        isPermistted ? this.service.findAll().subscribe(locationTypes => this.items = locationTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: LocationTypeDto) {
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
