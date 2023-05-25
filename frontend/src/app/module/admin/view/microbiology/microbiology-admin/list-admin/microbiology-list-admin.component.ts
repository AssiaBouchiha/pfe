import {Component, OnInit} from '@angular/core';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyCriteria} from 'src/app/controller/criteria/MicrobiologyCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { OrganismService } from 'src/app/controller/service/Organism.service';
import { SeroTypeService } from 'src/app/controller/service/SeroType.service';
import { AntibioticService } from 'src/app/controller/service/Antibiotic.service';
import { DataImportExportService } from 'src/app/controller/service/DataImportExport.service';

import {OrganismDto} from 'src/app/controller/model/Organism.model';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {SeroTypeDto} from 'src/app/controller/model/SeroType.model';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';


@Component({
  selector: 'app-microbiology-list-admin',
  templateUrl: './microbiology-list-admin.component.html'
})
export class MicrobiologyListAdminComponent extends AbstractListController<MicrobiologyDto, MicrobiologyCriteria, MicrobiologyService>  implements OnInit {

    fileName = 'Microbiology';

    organisms :Array<OrganismDto>;
    seroTypes :Array<SeroTypeDto>;
    antibiotics :Array<AntibioticDto>;
    dataImportExports :Array<DataImportExportDto>;
  
    constructor(microbiologyService: MicrobiologyService, private organismService: OrganismService, private seroTypeService: SeroTypeService, private antibioticService: AntibioticService, private dataImportExportService: DataImportExportService) {
        super(microbiologyService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadOrganism();
      this.loadSeroType();
      this.loadAntibiotic();
      this.loadDataImportExport();
    }

    public async loadMicrobiologys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Microbiology', 'list');
        isPermistted ? this.service.findAll().subscribe(microbiologys => this.items = microbiologys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'organism?.libelle', header: 'Organism'},
            {field: 'seroType?.libelle', header: 'Sero type'},
            {field: 'betalactamase', header: 'Betalactamase'},
            {field: 'esbl', header: 'Esbl'},
            {field: 'carbapenemase', header: 'Carbapenemase'},
            {field: 'mrsa', header: 'Mrsa'},
            {field: 'inducibleClindamycinResistance', header: 'Inducible clindamycin resistance'},
            {field: 'antibiotic?.code', header: 'Antibiotic'},
            {field: 'dataImportExport?.code', header: 'Data import export'},
        ];
    }


    public async loadOrganism(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Microbiology', 'list');
        isPermistted ? this.organismService.findAllOptimized().subscribe(organisms => this.organisms = organisms,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadSeroType(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Microbiology', 'list');
        isPermistted ? this.seroTypeService.findAllOptimized().subscribe(seroTypes => this.seroTypes = seroTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadAntibiotic(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Microbiology', 'list');
        isPermistted ? this.antibioticService.findAllOptimized().subscribe(antibiotics => this.antibiotics = antibiotics,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDataImportExport(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Microbiology', 'list');
        isPermistted ? this.dataImportExportService.findAllOptimized().subscribe(dataImportExports => this.dataImportExports = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: MicrobiologyDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Organism': e.organism?.libelle ,
                'Sero type': e.seroType?.libelle ,
                 'Betalactamase': e.betalactamase ,
                 'Esbl': e.esbl ,
                 'Carbapenemase': e.carbapenemase ,
                 'Mrsa': e.mrsa ,
                 'Inducible clindamycin resistance': e.inducibleClindamycinResistance ,
                'Antibiotic': e.antibiotic?.code ,
                'Data import export': e.dataImportExport?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        //'Organism': this.criteria.organism?.libelle ? this.criteria.organism?.libelle : environment.emptyForExport ,
        //'Sero type': this.criteria.seroType?.libelle ? this.criteria.seroType?.libelle : environment.emptyForExport ,
            'Betalactamase': this.criteria.betalactamase ? this.criteria.betalactamase : environment.emptyForExport ,
            'Esbl': this.criteria.esbl ? this.criteria.esbl : environment.emptyForExport ,
            'Carbapenemase': this.criteria.carbapenemase ? this.criteria.carbapenemase : environment.emptyForExport ,
            'Mrsa': this.criteria.mrsa ? this.criteria.mrsa : environment.emptyForExport ,
            'Inducible clindamycin resistance': this.criteria.inducibleClindamycinResistance ? this.criteria.inducibleClindamycinResistance : environment.emptyForExport ,
        //'Antibiotic': this.criteria.antibiotic?.code ? this.criteria.antibiotic?.code : environment.emptyForExport ,
        //'Data import export': this.criteria.dataImportExport?.code ? this.criteria.dataImportExport?.code : environment.emptyForExport ,
        }];
      }
}
