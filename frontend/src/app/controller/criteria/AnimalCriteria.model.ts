import {AnimalSpecieCriteria} from './AnimalSpecieCriteria.model';
import {AnimalTypeCriteria} from './AnimalTypeCriteria.model';
import {AgeCategoryCriteria} from './AgeCategoryCriteria.model';
import {GenderCriteria} from './GenderCriteria.model';
import {MarketCategoryCriteria} from './MarketCategoryCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class AnimalCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public name: string;
    public nameLike: string;
    public age: string;
    public ageLike: string;
  public gender: GenderCriteria ;
  public genders: Array<GenderCriteria> ;
  public ageCategory: AgeCategoryCriteria ;
  public ageCategorys: Array<AgeCategoryCriteria> ;
  public animalSpecie: AnimalSpecieCriteria ;
  public animalSpecies: Array<AnimalSpecieCriteria> ;
  public animalType: AnimalTypeCriteria ;
  public animalTypes: Array<AnimalTypeCriteria> ;
  public marketCategory: MarketCategoryCriteria ;
  public marketCategorys: Array<MarketCategoryCriteria> ;

}
