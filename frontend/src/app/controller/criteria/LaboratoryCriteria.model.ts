import {DataImportExportCriteria} from './DataImportExportCriteria.model';
import {DataAnalysisCriteria} from './DataAnalysisCriteria.model';
import {ReportCriteria} from './ReportCriteria.model';
import {AntibioticCriteria} from './AntibioticCriteria.model';
import {AlertCriteria} from './AlertCriteria.model';
import {LocationCriteria} from './LocationCriteria.model';
import {DataArchiveCriteria} from './DataArchiveCriteria.model';
import {NotificationCriteria} from './NotificationCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class LaboratoryCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public nom: string;
    public nomLike: string;
    public bloqued: null | boolean;
    public city: string;
    public cityLike: string;
  public location: LocationCriteria ;
  public locations: Array<LocationCriteria> ;
  public dataImportExport: DataImportExportCriteria ;
  public dataImportExports: Array<DataImportExportCriteria> ;
  public dataanalysis: DataAnalysisCriteria ;
  public dataanalysiss: Array<DataAnalysisCriteria> ;
  public dataarchive: DataArchiveCriteria ;
  public dataarchives: Array<DataArchiveCriteria> ;
  public report: ReportCriteria ;
  public reports: Array<ReportCriteria> ;
      public antibiotic: Array<AntibioticCriteria>;
      public alerts: Array<AlertCriteria>;
      public notifications: Array<NotificationCriteria>;

}
