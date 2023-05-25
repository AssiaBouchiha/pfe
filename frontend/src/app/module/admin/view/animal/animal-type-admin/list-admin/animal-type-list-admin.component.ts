import {Component, OnInit} from '@angular/core';
import {AnimalTypeService} from 'src/app/controller/service/AnimalType.service';
import {AnimalTypeDto} from 'src/app/controller/model/AnimalType.model';
import {AnimalTypeCriteria} from 'src/app/controller/criteria/AnimalTypeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-animal-type-list-admin',
  templateUrl: './animal-type-list-admin.component.html'
})
export class AnimalTypeListAdminComponent extends AbstractListController<AnimalTypeDto, AnimalTypeCriteria, AnimalTypeService>  implements OnInit {

    fileName = 'AnimalType';

  
    constructor(animalTypeService: AnimalTypeService) {
        super(animalTypeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadAnimalTypes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('AnimalType', 'list');
        isPermistted ? this.service.findAll().subscribe(animalTypes => this.items = animalTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: AnimalTypeDto) {
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
