import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportCriteria} from 'src/app/controller/criteria/DataImportExportCriteria.model';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {MicrobiologyService} from 'src/app/controller/service/Microbiology.service';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';
import {SpecimenService} from 'src/app/controller/service/Specimen.service';
import {LocationDataDto} from 'src/app/controller/model/LocationData.model';
import {LocationDataService} from 'src/app/controller/service/LocationData.service';
@Component({
  selector: 'app-data-import-export-create-admin',
  templateUrl: './data-import-export-create-admin.component.html'
})
export class DataImportExportCreateAdminComponent extends AbstractCreateController<DataImportExportDto, DataImportExportCriteria, DataImportExportService>  implements OnInit {



   private _validDataImportExportCode = true;
    private _validLocationDataCode = true;
    private _validSpecimenCode = true;
    private _validMicrobiologyCode = true;

    constructor( private dataImportExportService: DataImportExportService , private microbiologyService: MicrobiologyService, private specimenService: SpecimenService, private locationDataService: LocationDataService) {
        super(dataImportExportService);
    }

    ngOnInit(): void {
    this.locationData = new LocationDataDto();
    this.locationDataService.findAll().subscribe((data) => this.locationDatas = data);
    this.specimen = new SpecimenDto();
    this.specimenService.findAll().subscribe((data) => this.specimens = data);
    this.microbiology = new MicrobiologyDto();
    this.microbiologyService.findAll().subscribe((data) => this.microbiologys = data);
}





    public setValidation(value: boolean){
        this.validDataImportExportCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateDataImportExportCode();
    }

    public validateDataImportExportCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validDataImportExportCode = false;
        } else {
            this.validDataImportExportCode = true;
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
    get specimen(): SpecimenDto {
        return this.specimenService.item;
    }
    set specimen(value: SpecimenDto) {
        this.specimenService.item = value;
    }
    get specimens(): Array<SpecimenDto> {
        return this.specimenService.items;
    }
    set specimens(value: Array<SpecimenDto>) {
        this.specimenService.items = value;
    }
    get createSpecimenDialog(): boolean {
       return this.specimenService.createDialog;
    }
    set createSpecimenDialog(value: boolean) {
        this.specimenService.createDialog= value;
    }
    get locationData(): LocationDataDto {
        return this.locationDataService.item;
    }
    set locationData(value: LocationDataDto) {
        this.locationDataService.item = value;
    }
    get locationDatas(): Array<LocationDataDto> {
        return this.locationDataService.items;
    }
    set locationDatas(value: Array<LocationDataDto>) {
        this.locationDataService.items = value;
    }
    get createLocationDataDialog(): boolean {
       return this.locationDataService.createDialog;
    }
    set createLocationDataDialog(value: boolean) {
        this.locationDataService.createDialog= value;
    }



    get validDataImportExportCode(): boolean {
        return this._validDataImportExportCode;
    }

    set validDataImportExportCode(value: boolean) {
         this._validDataImportExportCode = value;
    }

    get validLocationDataCode(): boolean {
        return this._validLocationDataCode;
    }
    set validLocationDataCode(value: boolean) {
        this._validLocationDataCode = value;
    }
    get validSpecimenCode(): boolean {
        return this._validSpecimenCode;
    }
    set validSpecimenCode(value: boolean) {
        this._validSpecimenCode = value;
    }
    get validMicrobiologyCode(): boolean {
        return this._validMicrobiologyCode;
    }
    set validMicrobiologyCode(value: boolean) {
        this._validMicrobiologyCode = value;
    }


}
