import {BrandCriteria} from './BrandCriteria.model';
import {AnimalSpecieCriteria} from './AnimalSpecieCriteria.model';
import {MarketCategoryCriteria} from './MarketCategoryCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class FoodCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public libelle: string;
    public libelleLike: string;
  public animalSpecie: AnimalSpecieCriteria ;
  public animalSpecies: Array<AnimalSpecieCriteria> ;
  public marketCategory: MarketCategoryCriteria ;
  public marketCategorys: Array<MarketCategoryCriteria> ;
  public brand: BrandCriteria ;
  public brands: Array<BrandCriteria> ;

}
