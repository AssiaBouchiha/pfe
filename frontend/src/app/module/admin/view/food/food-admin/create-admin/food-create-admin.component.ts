import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {FoodService} from 'src/app/controller/service/Food.service';
import {FoodDto} from 'src/app/controller/model/Food.model';
import {FoodCriteria} from 'src/app/controller/criteria/FoodCriteria.model';
import {BrandDto} from 'src/app/controller/model/Brand.model';
import {BrandService} from 'src/app/controller/service/Brand.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {AnimalSpecieDto} from 'src/app/controller/model/AnimalSpecie.model';
import {AnimalSpecieService} from 'src/app/controller/service/AnimalSpecie.service';
@Component({
  selector: 'app-food-create-admin',
  templateUrl: './food-create-admin.component.html'
})
export class FoodCreateAdminComponent extends AbstractCreateController<FoodDto, FoodCriteria, FoodService>  implements OnInit {



   private _validFoodCode = true;
    private _validAnimalSpecieCode = true;
    private _validAnimalSpecieLibelle = true;
    private _validMarketCategoryCode = true;
    private _validMarketCategoryLibelle = true;
    private _validBrandCode = true;
    private _validBrandLibelle = true;
    private _validDataImportExportCode = true;

    constructor( private foodService: FoodService , private brandService: BrandService, private marketCategoryService: MarketCategoryService, private dataImportExportService: DataImportExportService, private animalSpecieService: AnimalSpecieService) {
        super(foodService);
    }

    ngOnInit(): void {
    this.animalSpecie = new AnimalSpecieDto();
    this.animalSpecieService.findAll().subscribe((data) => this.animalSpecies = data);
    this.marketCategory = new MarketCategoryDto();
    this.marketCategoryService.findAll().subscribe((data) => this.marketCategorys = data);
    this.brand = new BrandDto();
    this.brandService.findAll().subscribe((data) => this.brands = data);
    this.dataImportExport = new DataImportExportDto();
    this.dataImportExportService.findAll().subscribe((data) => this.dataImportExports = data);
}





    public setValidation(value: boolean){
        this.validFoodCode = value;
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateFoodCode();
    }

    public validateFoodCode(){
        if (this.stringUtilService.isEmpty(this.item.code)) {
        this.errorMessages.push('Code non valide');
        this.validFoodCode = false;
        } else {
            this.validFoodCode = true;
        }
    }


    public async openCreateBrand(brand: string) {
    const isPermistted = await this.roleService.isPermitted('Brand', 'add');
    if(isPermistted) {
         this.brand = new BrandDto();
         this.createBrandDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
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
    get brand(): BrandDto {
        return this.brandService.item;
    }
    set brand(value: BrandDto) {
        this.brandService.item = value;
    }
    get brands(): Array<BrandDto> {
        return this.brandService.items;
    }
    set brands(value: Array<BrandDto>) {
        this.brandService.items = value;
    }
    get createBrandDialog(): boolean {
       return this.brandService.createDialog;
    }
    set createBrandDialog(value: boolean) {
        this.brandService.createDialog= value;
    }
    get animalSpecie(): AnimalSpecieDto {
        return this.animalSpecieService.item;
    }
    set animalSpecie(value: AnimalSpecieDto) {
        this.animalSpecieService.item = value;
    }
    get animalSpecies(): Array<AnimalSpecieDto> {
        return this.animalSpecieService.items;
    }
    set animalSpecies(value: Array<AnimalSpecieDto>) {
        this.animalSpecieService.items = value;
    }
    get createAnimalSpecieDialog(): boolean {
       return this.animalSpecieService.createDialog;
    }
    set createAnimalSpecieDialog(value: boolean) {
        this.animalSpecieService.createDialog= value;
    }
    get marketCategory(): MarketCategoryDto {
        return this.marketCategoryService.item;
    }
    set marketCategory(value: MarketCategoryDto) {
        this.marketCategoryService.item = value;
    }
    get marketCategorys(): Array<MarketCategoryDto> {
        return this.marketCategoryService.items;
    }
    set marketCategorys(value: Array<MarketCategoryDto>) {
        this.marketCategoryService.items = value;
    }
    get createMarketCategoryDialog(): boolean {
       return this.marketCategoryService.createDialog;
    }
    set createMarketCategoryDialog(value: boolean) {
        this.marketCategoryService.createDialog= value;
    }



    get validFoodCode(): boolean {
        return this._validFoodCode;
    }

    set validFoodCode(value: boolean) {
         this._validFoodCode = value;
    }

    get validAnimalSpecieCode(): boolean {
        return this._validAnimalSpecieCode;
    }
    set validAnimalSpecieCode(value: boolean) {
        this._validAnimalSpecieCode = value;
    }
    get validAnimalSpecieLibelle(): boolean {
        return this._validAnimalSpecieLibelle;
    }
    set validAnimalSpecieLibelle(value: boolean) {
        this._validAnimalSpecieLibelle = value;
    }
    get validMarketCategoryCode(): boolean {
        return this._validMarketCategoryCode;
    }
    set validMarketCategoryCode(value: boolean) {
        this._validMarketCategoryCode = value;
    }
    get validMarketCategoryLibelle(): boolean {
        return this._validMarketCategoryLibelle;
    }
    set validMarketCategoryLibelle(value: boolean) {
        this._validMarketCategoryLibelle = value;
    }
    get validBrandCode(): boolean {
        return this._validBrandCode;
    }
    set validBrandCode(value: boolean) {
        this._validBrandCode = value;
    }
    get validBrandLibelle(): boolean {
        return this._validBrandLibelle;
    }
    set validBrandLibelle(value: boolean) {
        this._validBrandLibelle = value;
    }
    get validDataImportExportCode(): boolean {
        return this._validDataImportExportCode;
    }
    set validDataImportExportCode(value: boolean) {
        this._validDataImportExportCode = value;
    }


}
