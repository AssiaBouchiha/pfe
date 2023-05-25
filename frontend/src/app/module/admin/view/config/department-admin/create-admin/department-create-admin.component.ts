import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DepartmentService} from 'src/app/controller/service/Department.service';
import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DepartmentCriteria} from 'src/app/controller/criteria/DepartmentCriteria.model';
@Component({
  selector: 'app-department-create-admin',
  templateUrl: './department-create-admin.component.html'
})
export class DepartmentCreateAdminComponent extends AbstractCreateController<DepartmentDto, DepartmentCriteria, DepartmentService>  implements OnInit {



   private _validDepartmentCode = true;
   private _validDepartmentLibelle = true;

    constructor( private departmentService: DepartmentService ) {
        super(departmentService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
        this.validDepartmentCode = value;
        this.validDepartmentLibelle = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateDepartmentCode();
        this.validateDepartmentLibelle();
    }

    public validateDepartmentCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validDepartmentCode = false;
        } else {
            this.validDepartmentCode = true;
        }
    }
    public validateDepartmentLibelle(){
        if (this.stringUtilService.isEmpty(this.item.libelle)) {
        this.errorMessages.push('Libelle non valide');
        this.validDepartmentLibelle = false;
        } else {
            this.validDepartmentLibelle = true;
        }
    }






    get validDepartmentCode(): boolean {
        return this._validDepartmentCode;
    }

    set validDepartmentCode(value: boolean) {
         this._validDepartmentCode = value;
    }
    get validDepartmentLibelle(): boolean {
        return this._validDepartmentLibelle;
    }

    set validDepartmentLibelle(value: boolean) {
         this._validDepartmentLibelle = value;
    }



}
