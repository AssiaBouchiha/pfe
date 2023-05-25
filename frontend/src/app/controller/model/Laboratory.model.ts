import {DataImportExportDto} from './DataImportExport.model';
import {DataAnalysisDto} from './DataAnalysis.model';
import {ReportDto} from './Report.model';
import {AntibioticDto} from './Antibiotic.model';
import {AlertDto} from './Alert.model';
import {LocationDto} from './Location.model';
import {DataArchiveDto} from './DataArchive.model';
import {NotificationDto} from './Notification.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class LaboratoryDto  extends BaseDto{

    public id: number;
    public code: string;
    public nom: string;
   public bloqued: null | boolean;
    public city: string;
    public location: LocationDto ;
    public dataImportExport: DataImportExportDto ;
    public dataanalysis: DataAnalysisDto ;
    public dataarchive: DataArchiveDto ;
    public report: ReportDto ;
     public antibiotic: Array<AntibioticDto>;
     public alerts: Array<AlertDto>;
     public notifications: Array<NotificationDto>;

}
