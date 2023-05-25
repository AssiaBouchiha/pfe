import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {LocationService} from 'src/app/controller/service/Location.service';
import {LocationDto} from 'src/app/controller/model/Location.model';
import {LocationCriteria} from 'src/app/controller/criteria/LocationCriteria.model';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LaboratoryService} from 'src/app/controller/service/Laboratory.service';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';
import {LocationTypeService} from 'src/app/controller/service/LocationType.service';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {InstitutionService} from 'src/app/controller/service/Institution.service';
import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DepartmentService} from 'src/app/controller/service/Department.service';
@Component({
  selector: 'app-location-create-admin',
  templateUrl: './location-create-admin.component.html'
})
export class LocationCreateAdminComponent extends AbstractCreateController<LocationDto, LocationCriteria, LocationService>  implements OnInit {



   private _validLocationCode = true;
    private _validInstitutionCode = true;
    private _validInstitutionLibelle = true;
    private _validDepartmentCode = true;
    private _validDepartmentLibelle = true;
    private _validLocationTypeCode = true;
    private _validLocationTypeLibelle = true;
    private _validLaboratoryCode = true;

    constructor( private locationService: LocationService , private laboratoryService: LaboratoryService, private locationTypeService: LocationTypeService, private institutionService: InstitutionService, private departmentService: DepartmentService) {
        super(locationService);
    }

    ngOnInit(): void {
    this.institution = new InstitutionDto();
    this.institutionService.findAll().subscribe((data) => this.institutions = data);
    this.department = new DepartmentDto();
    this.departmentService.findAll().subscribe((data) => this.departments = data);
    this.locationType = new LocationTypeDto();
    this.locationTypeService.findAll().subscribe((data) => this.locationTypes = data);
    this.laboratory = new LaboratoryDto();
    this.laboratoryService.findAll().subscribe((data) => this.laboratorys = data);
}





    public setValidation(value: boolean){
        this.validLocationCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateLocationCode();
    }

    public validateLocationCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validLocationCode = false;
        } else {
            this.validLocationCode = true;
        }
    }



    get locationType(): LocationTypeDto {
        return this.locationTypeService.item;
    }
    set locationType(value: LocationTypeDto) {
        this.locationTypeService.item = value;
    }
    get locationTypes(): Array<LocationTypeDto> {
        return this.locationTypeService.items;
    }
    set locationTypes(value: Array<LocationTypeDto>) {
        this.locationTypeService.items = value;
    }
    get createLocationTypeDialog(): boolean {
       return this.locationTypeService.createDialog;
    }
    set createLocationTypeDialog(value: boolean) {
        this.locationTypeService.createDialog= value;
    }
    get department(): DepartmentDto {
        return this.departmentService.item;
    }
    set department(value: DepartmentDto) {
        this.departmentService.item = value;
    }
    get departments(): Array<DepartmentDto> {
        return this.departmentService.items;
    }
    set departments(value: Array<DepartmentDto>) {
        this.departmentService.items = value;
    }
    get createDepartmentDialog(): boolean {
       return this.departmentService.createDialog;
    }
    set createDepartmentDialog(value: boolean) {
        this.departmentService.createDialog= value;
    }
    get institution(): InstitutionDto {
        return this.institutionService.item;
    }
    set institution(value: InstitutionDto) {
        this.institutionService.item = value;
    }
    get institutions(): Array<InstitutionDto> {
        return this.institutionService.items;
    }
    set institutions(value: Array<InstitutionDto>) {
        this.institutionService.items = value;
    }
    get createInstitutionDialog(): boolean {
       return this.institutionService.createDialog;
    }
    set createInstitutionDialog(value: boolean) {
        this.institutionService.createDialog= value;
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



    get validLocationCode(): boolean {
        return this._validLocationCode;
    }

    set validLocationCode(value: boolean) {
         this._validLocationCode = value;
    }

    get validInstitutionCode(): boolean {
        return this._validInstitutionCode;
    }
    set validInstitutionCode(value: boolean) {
        this._validInstitutionCode = value;
    }
    get validInstitutionLibelle(): boolean {
        return this._validInstitutionLibelle;
    }
    set validInstitutionLibelle(value: boolean) {
        this._validInstitutionLibelle = value;
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
    get validLocationTypeCode(): boolean {
        return this._validLocationTypeCode;
    }
    set validLocationTypeCode(value: boolean) {
        this._validLocationTypeCode = value;
    }
    get validLocationTypeLibelle(): boolean {
        return this._validLocationTypeLibelle;
    }
    set validLocationTypeLibelle(value: boolean) {
        this._validLocationTypeLibelle = value;
    }
    get validLaboratoryCode(): boolean {
        return this._validLaboratoryCode;
    }
    set validLaboratoryCode(value: boolean) {
        this._validLaboratoryCode = value;
    }


}
