import {DataImportExportCriteria} from './DataImportExportCriteria.model';
import {AgeCategoryCriteria} from './AgeCategoryCriteria.model';
import {GenderCriteria} from './GenderCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class PlantCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public lastname: string;
    public lastnameLike: string;
    public firstname: string;
    public firstnameLike: string;
    public dateofbirth: Date;
    public dateofbirthFrom: Date;
    public dateofbirthTo: Date;
    public age: string;
    public ageLike: string;
  public gender: GenderCriteria ;
  public genders: Array<GenderCriteria> ;
  public ageCategory: AgeCategoryCriteria ;
  public ageCategorys: Array<AgeCategoryCriteria> ;
  public dataImportExport: DataImportExportCriteria ;
  public dataImportExports: Array<DataImportExportCriteria> ;

}
