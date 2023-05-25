import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

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
  selector: 'app-antibiotic-create-admin',
  templateUrl: './antibiotic-create-admin.component.html'
})
export class AntibioticCreateAdminComponent extends AbstractCreateController<AntibioticDto, AntibioticCriteria, AntibioticService>  implements OnInit {

    private _laboratoryAntibioticsElement = new LaboratoryAntibioticDto();


   private _validAntibioticCode = true;
    private _validMicrobiologyCode = true;
    private _laboratoryAntibiotics: Array<LaboratoryAntibioticDto> = [];

    constructor( private antibioticService: AntibioticService , private microbiologyService: MicrobiologyService, private laboratoryService: LaboratoryService, private laboratoryAntibioticService: LaboratoryAntibioticService) {
        super(antibioticService);
    }

    ngOnInit(): void {
        this.laboratoryService.findAll().subscribe(data => this.prepareLaboratoryAntibiotics(data));
        this.laboratoryAntibioticsElement.laboratory = new LaboratoryDto();
        this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
    this.microbiology = new MicrobiologyDto();
    this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
}


     prepareLaboratoryAntibiotics(laboratorys: Array<LaboratoryDto>): void{
        if( laboratorys != null){
                laboratorys.forEach(e => {
                const laboratoryAntibiotic = new LaboratoryAntibioticDto();
                laboratoryAntibiotic.laboratory = e;
                this.laboratoryAntibiotics.push(laboratoryAntibiotic);
            });
        }
    }



    public setValidation(value: boolean){
        this.validAntibioticCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateAntibioticCode();
    }

    public validateAntibioticCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validAntibioticCode = false;
        } else {
            this.validAntibioticCode = true;
        }
    }



    get microbiology(): MicrobiologyDto {
        return this.microbiologyService.item;
    }
    set microbiology(value: MicrobiologyDto) {
        this.microbiologyService.item = value;
    }
    get microbiologys(): Array<MicrobiologyDto> {
        return this.microbiologyService.items;
    }
    set microbiologys(value: Array<MicrobiologyDto>) {
        this.microbiologyService.items = value;
    }
    get createMicrobiologyDialog(): boolean {
       return this.microbiologyService.createDialog;
    }
    set createMicrobiologyDialog(value: boolean) {
        this.microbiologyService.createDialog= value;
    }
    get laboratory(): LaboratoryDto {
        return this.laboratoryService.item;
    }
    set laboratory(value: LaboratoryDto) {
        this.laboratoryService.item = value;
    }
    get laboratorys(): Array<LaboratoryDto> {
        return this.laboratoryService.items;
    }
    set laboratorys(value: Array<LaboratoryDto>) {
        this.laboratoryService.items = value;
    }
    get createLaboratoryDialog(): boolean {
       return this.laboratoryService.createDialog;
    }
    set createLaboratoryDialog(value: boolean) {
        this.laboratoryService.createDialog= value;
    }

    get laboratoryAntibiotics(): Array<LaboratoryAntibioticDto> {
        if( this._laboratoryAntibiotics == null )
            this._laboratoryAntibiotics = new Array();
        return this._laboratoryAntibiotics;
    }

    set laboratoryAntibiotics(value: Array<LaboratoryAntibioticDto>) {
        this._laboratoryAntibiotics = value;
    }


    get validAntibioticCode(): boolean {
        return this._validAntibioticCode;
    }

    set validAntibioticCode(value: boolean) {
         this._validAntibioticCode = value;
    }

    get validMicrobiologyCode(): boolean {
        return this._validMicrobiologyCode;
    }
    set validMicrobiologyCode(value: boolean) {
        this._validMicrobiologyCode = value;
    }

    get laboratoryAntibioticsElement(): LaboratoryAntibioticDto {
        if( this._laboratoryAntibioticsElement == null )
            this._laboratoryAntibioticsElement = new LaboratoryAntibioticDto();
        return this._laboratoryAntibioticsElement;
    }

    set laboratoryAntibioticsElement(value: LaboratoryAntibioticDto) {
        this._laboratoryAntibioticsElement = value;
    }

}
