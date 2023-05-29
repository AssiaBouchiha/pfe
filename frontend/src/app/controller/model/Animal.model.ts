import {AnimalSpecieDto} from './AnimalSpecie.model';
import {AnimalTypeDto} from './AnimalType.model';
import {AgeCategoryDto} from './AgeCategory.model';
import {GenderDto} from './Gender.model';
import {MarketCategoryDto} from './MarketCategory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class AnimalDto  extends BaseDto{

    public id: number;
    public code: string;
    public name: string;
    public age: string;
    public gender: GenderDto ;
    public ageCategory: AgeCategoryDto ;
    public animalSpecie: AnimalSpecieDto ;
    public animalType: AnimalTypeDto ;
    public marketCategory: MarketCategoryDto ;

}
