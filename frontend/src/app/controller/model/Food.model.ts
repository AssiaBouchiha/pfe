import {BrandDto} from './Brand.model';
import {DataImportExportDto} from './DataImportExport.model';
import {AnimalSpecieDto} from './AnimalSpecie.model';
import {MarketCategoryDto} from './MarketCategory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class FoodDto  extends BaseDto{

    public id: number;
    public code: string;
    public libelle: string;
    public animalSpecie: AnimalSpecieDto ;
    public marketCategory: MarketCategoryDto ;
    public brand: BrandDto ;
    public dataImportExport: DataImportExportDto ;

}
