import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticCriteria} from 'src/app/controller/criteria/AntibioticCriteria.model';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
@Component({
  selector: 'app-antibiotic-create-admin',
  templateUrl: './antibiotic-create-admin.component.html'
})
export class AntibioticCreateAdminComponent extends AbstractCreateController<AntibioticDto, AntibioticCriteria, AntibioticService>  implements OnInit {



   private _validAntibioticCode = true;
    private _validMicrobiologyCode = true;

    constructor( private antibioticService: AntibioticService , private microbiologyService: MicrobiologyService) {
        super(antibioticService);
    }

    ngOnInit(): void {
    this.microbiology = new MicrobiologyDto();
    this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
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


}
