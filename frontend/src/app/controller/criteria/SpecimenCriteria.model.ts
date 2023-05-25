import {DataImportExportCriteria} from './DataImportExportCriteria.model';
import {ReasonCriteria} from './ReasonCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class SpecimenCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public date: Date;
    public dateFrom: Date;
    public dateTo: Date;
    public type: string;
    public typeLike: string;
  public reason: ReasonCriteria ;
  public reasons: Array<ReasonCriteria> ;
  public dataImportExport: DataImportExportCriteria ;
  public dataImportExports: Array<DataImportExportCriteria> ;

}
