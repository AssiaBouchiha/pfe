import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticCriteria} from 'src/app/controller/criteria/AntibioticCriteria.model';

import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LaboratoryAntibioticDto} from 'src/app/controller/model/LaboratoryAntibiotic.model';
import {LaboratoryAntibioticService} from 'src/app/controller/service/LaboratoryAntibiotic.service';
@Component({
  selector: 'app-antibiotic-view-admin',
  templateUrl: './antibiotic-view-admin.component.html'
})
export class AntibioticViewAdminComponent extends AbstractViewController<AntibioticDto, AntibioticCriteria, AntibioticService> implements OnInit {

    laboratoryAntibiotics = new LaboratoryAntibioticDto();
    laboratoryAntibioticss: Array<LaboratoryAntibioticDto> = [];

    constructor(private antibioticService: AntibioticService, private microbiologyService: MicrobiologyService, private laboratoryService: LaboratoryService, private laboratoryAntibioticService: LaboratoryAntibioticService){
        super(antibioticService);
    }

    ngOnInit(): void {
        this.laboratoryAntibiotics.laboratory = new LaboratoryDto();
        this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
        this.microbiology = new MicrobiologyDto();
        this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
    }


    get microbiology(): MicrobiologyDto {
       return this.microbiologyService.item;
    }
    set microbiology(value: MicrobiologyDto) {
        this.microbiologyService.item = value;
    }
    get microbiologys():Array<MicrobiologyDto> {
       return this.microbiologyService.items;
    }
    set microbiologys(value: Array<MicrobiologyDto>) {
        this.microbiologyService.items = value;
    }
    get laboratory(): LaboratoryDto {
       return this.laboratoryService.item;
    }
    set laboratory(value: LaboratoryDto) {
        this.laboratoryService.item = value;
    }
    get laboratorys():Array<LaboratoryDto> {
       return this.laboratoryService.items;
    }
    set laboratorys(value: Array<LaboratoryDto>) {
        this.laboratoryService.items = value;
    }


}
