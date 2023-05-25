import {Component, OnInit} from '@angular/core';
import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieCriteria} from 'src/app/controller/criteria/AnimalSpecieCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-animal-specie-list-admin',
  templateUrl: './animal-specie-list-admin.component.html'
})
export class AnimalSpecieListAdminComponent extends AbstractListController<AnimalSpecieDto, AnimalSpecieCriteria, AnimalSpecieService>  implements OnInit {

    fileName = 'AnimalSpecie';

  
    constructor(animalSpecieService: AnimalSpecieService) {
        super(animalSpecieService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadAnimalSpecies(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('AnimalSpecie', 'list');
        isPermistted ? this.service.findAll().subscribe(animalSpecies => this.items = animalSpecies,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: AnimalSpecieDto) {
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
