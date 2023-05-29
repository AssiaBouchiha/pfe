import {Component, OnInit} from '@angular/core';
import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticCriteria} from 'src/app/controller/criteria/AntibioticCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { MicrobiologyService } from 'src/app/controller/service/Microbiology.service';

import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';


@Component({
  selector: 'app-antibiotic-list-admin',
  templateUrl: './antibiotic-list-admin.component.html'
})
export class AntibioticListAdminComponent extends AbstractListController<AntibioticDto, AntibioticCriteria, AntibioticService>  implements OnInit {

    fileName = 'Antibiotic';

    microbiologys :Array<MicrobiologyDto>;
  
    constructor(antibioticService: AntibioticService, private microbiologyService: MicrobiologyService) {
        super(antibioticService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadMicrobiology();
    }

    public async loadAntibiotics(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Antibiotic', 'list');
        isPermistted ? this.service.findAll().subscribe(antibiotics => this.items = antibiotics,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'nom', header: 'Nom'},
            {field: 'microbiology?.code', header: 'Microbiology'},
        ];
    }


    public async loadMicrobiology(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Antibiotic', 'list');
        isPermistted ? this.microbiologyService.findAllOptimized().subscribe(microbiologys => this.microbiologys = microbiologys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: AntibioticDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Nom': e.nom ,
                'Microbiology': e.microbiology?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
        //'Microbiology': this.criteria.microbiology?.code ? this.criteria.microbiology?.code : environment.emptyForExport ,
        }];
      }
}
