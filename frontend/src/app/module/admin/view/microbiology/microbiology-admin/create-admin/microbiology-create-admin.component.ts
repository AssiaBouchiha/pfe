import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyCriteria} from 'src/app/controller/criteria/MicrobiologyCriteria.model';
import {SeroTypeDto} from 'src/app/controller/model/SeroType.model';
import {SeroTypeService} from 'src/app/controller/service/SeroType.service';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {AntibioticDto} from 'src/app/controller/model/Antibiotic.model';
import {AntibioticService} from 'src/app/controller/service/Antibiotic.service';
import {OrganismDto} from 'src/app/controller/model/Organism.model';
import {OrganismService} from 'src/app/controller/service/Organism.service';
@Component({
  selector: 'app-microbiology-create-admin',
  templateUrl: './microbiology-create-admin.component.html'
})
export class MicrobiologyCreateAdminComponent extends AbstractCreateController<MicrobiologyDto, MicrobiologyCriteria, MicrobiologyService>  implements OnInit {



   private _validMicrobiologyCode = true;
    private _validOrganismCode = true;
    private _validOrganismLibelle = true;
    private _validSeroTypeCode = true;
    private _validSeroTypeLibelle = true;
    private _validAntibioticCode = true;
    private _validDataImportExportCode = true;

    constructor( private microbiologyService: MicrobiologyService , private seroTypeService: SeroTypeService, private dataImportExportService: DataImportExportService, private antibioticService: AntibioticService, private organismService: OrganismService) {
        super(microbiologyService);
    }

    ngOnInit(): void {
    this.organism = new OrganismDto();
    this.organismService.findAll().subscribe((data) => this.organisms = data);
    this.seroType = new SeroTypeDto();
    this.seroTypeService.findAll().subscribe((data) => this.seroTypes = data);
    this.antibiotic = new AntibioticDto();
    this.antibioticService.findAll().subscribe((data) => this.antibiotics = data);
    this.dataImportExport = new DataImportExportDto();
    this.dataImportExportService.findAll().subscribe((data) => this.dataImportExports = data);
}





    public setValidation(value: boolean){
        this.validMicrobiologyCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateMicrobiologyCode();
    }

    public validateMicrobiologyCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validMicrobiologyCode = false;
        } else {
            this.validMicrobiologyCode = true;
        }
    }



    get seroType(): SeroTypeDto {
        return this.seroTypeService.item;
    }
    set seroType(value: SeroTypeDto) {
        this.seroTypeService.item = value;
    }
    get seroTypes(): Array<SeroTypeDto> {
        return this.seroTypeService.items;
    }
    set seroTypes(value: Array<SeroTypeDto>) {
        this.seroTypeService.items = value;
    }
    get createSeroTypeDialog(): boolean {
       return this.seroTypeService.createDialog;
    }
    set createSeroTypeDialog(value: boolean) {
        this.seroTypeService.createDialog= value;
    }
    get antibiotic(): AntibioticDto {
        return this.antibioticService.item;
    }
    set antibiotic(value: AntibioticDto) {
        this.antibioticService.item = value;
    }
    get antibiotics(): Array<AntibioticDto> {
        return this.antibioticService.items;
    }
    set antibiotics(value: Array<AntibioticDto>) {
        this.antibioticService.items = value;
    }
    get createAntibioticDialog(): boolean {
       return this.antibioticService.createDialog;
    }
    set createAntibioticDialog(value: boolean) {
        this.antibioticService.createDialog= value;
    }
    get dataImportExport(): DataImportExportDto {
        return this.dataImportExportService.item;
    }
    set dataImportExport(value: DataImportExportDto) {
        this.dataImportExportService.item = value;
    }
    get dataImportExports(): Array<DataImportExportDto> {
        return this.dataImportExportService.items;
    }
    set dataImportExports(value: Array<DataImportExportDto>) {
        this.dataImportExportService.items = value;
    }
    get createDataImportExportDialog(): boolean {
       return this.dataImportExportService.createDialog;
    }
    set createDataImportExportDialog(value: boolean) {
        this.dataImportExportService.createDialog= value;
    }
    get organism(): OrganismDto {
        return this.organismService.item;
    }
    set organism(value: OrganismDto) {
        this.organismService.item = value;
    }
    get organisms(): Array<OrganismDto> {
        return this.organismService.items;
    }
    set organisms(value: Array<OrganismDto>) {
        this.organismService.items = value;
    }
    get createOrganismDialog(): boolean {
       return this.organismService.createDialog;
    }
    set createOrganismDialog(value: boolean) {
        this.organismService.createDialog= value;
    }



    get validMicrobiologyCode(): boolean {
        return this._validMicrobiologyCode;
    }

    set validMicrobiologyCode(value: boolean) {
         this._validMicrobiologyCode = value;
    }

    get validOrganismCode(): boolean {
        return this._validOrganismCode;
    }
    set validOrganismCode(value: boolean) {
        this._validOrganismCode = value;
    }
    get validOrganismLibelle(): boolean {
        return this._validOrganismLibelle;
    }
    set validOrganismLibelle(value: boolean) {
        this._validOrganismLibelle = value;
    }
    get validSeroTypeCode(): boolean {
        return this._validSeroTypeCode;
    }
    set validSeroTypeCode(value: boolean) {
        this._validSeroTypeCode = value;
    }
    get validSeroTypeLibelle(): boolean {
        return this._validSeroTypeLibelle;
    }
    set validSeroTypeLibelle(value: boolean) {
        this._validSeroTypeLibelle = value;
    }
    get validAntibioticCode(): boolean {
        return this._validAntibioticCode;
    }
    set validAntibioticCode(value: boolean) {
        this._validAntibioticCode = value;
    }
    get validDataImportExportCode(): boolean {
        return this._validDataImportExportCode;
    }
    set validDataImportExportCode(value: boolean) {
        this._validDataImportExportCode = value;
    }


}