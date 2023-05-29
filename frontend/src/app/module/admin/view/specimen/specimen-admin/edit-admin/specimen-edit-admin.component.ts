import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {SpecimenService} from 'src/app/controller/service/Specimen.service';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';
import {SpecimenCriteria} from 'src/app/controller/criteria/SpecimenCriteria.model';


import {ReasonDto} from 'src/app/controller/model/Reason.model';
import {ReasonService} from 'src/app/controller/service/Reason.service';

@Component({
  selector: 'app-specimen-edit-admin',
  templateUrl: './specimen-edit-admin.component.html'
})
export class SpecimenEditAdminComponent extends AbstractEditController<SpecimenDto, SpecimenCriteria, SpecimenService>   implements OnInit {


    private _validSpecimenCode = true;

    private _validReasonCode = true;
    private _validReasonLibelle = true;



    constructor( private specimenService: SpecimenService , private reasonService: ReasonService) {
        super(specimenService);
    }

    ngOnInit(): void {
    this.reason = new ReasonDto();
    this.reasonService.findAll().subscribe((data) => this.reasons = data);
}
    public prepareEdit() {
        this.item.date = this.specimenService.format(this.item.date);
    }



    public setValidation(value : boolean){
        this.validSpecimenCode = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateSpecimenCode();
    }
    public validateSpecimenCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
            this.errorMessages.push('Code non valide');
            this.validSpecimenCode = false;
        } else {
            this.validSpecimenCode = true;
        }
    }



   public async openCreateReason(reason: string) {
        const isPermistted = await this.roleService.isPermitted('Reason', 'edit');
        if(isPermistted) {
             this.reason = new ReasonDto();
             this.createReasonDialog = true;
        }else{
             this.messageService.add({
                severity: 'error', summary: 'erreur', detail: 'problème de permission'
            });
        }
    }

   get reason(): ReasonDto {
       return this.reasonService.item;
   }
  set reason(value: ReasonDto) {
        this.reasonService.item = value;
   }
   get reasons(): Array<ReasonDto> {
        return this.reasonService.items;
   }
   set reasons(value: Array<ReasonDto>) {
        this.reasonService.items = value;
   }
   get createReasonDialog(): boolean {
       return this.reasonService.createDialog;
   }
  set createReasonDialog(value: boolean) {
       this.reasonService.createDialog= value;
   }


    get validSpecimenCode(): boolean {
        return this._validSpecimenCode;
    }
    set validSpecimenCode(value: boolean) {
        this._validSpecimenCode = value;
    }

    get validReasonCode(): boolean {
        return this._validReasonCode;
    }
    set validReasonCode(value: boolean) {
        this._validReasonCode = value;
    }
    get validReasonLibelle(): boolean {
        return this._validReasonLibelle;
    }
    set validReasonLibelle(value: boolean) {
        this._validReasonLibelle = value;
    }
}
