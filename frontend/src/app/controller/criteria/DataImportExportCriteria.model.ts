import {LocationDataCriteria} from './LocationDataCriteria.model';
import {MicrobiologyCriteria} from './MicrobiologyCriteria.model';
import {SpecimenCriteria} from './SpecimenCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class DataImportExportCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
  public locationData: LocationDataCriteria ;
  public locationDatas: Array<LocationDataCriteria> ;
  public specimen: SpecimenCriteria ;
  public specimens: Array<SpecimenCriteria> ;
  public microbiology: MicrobiologyCriteria ;
  public microbiologys: Array<MicrobiologyCriteria> ;

}
