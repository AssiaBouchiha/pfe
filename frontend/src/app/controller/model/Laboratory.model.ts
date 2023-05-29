import {DataAnalysisDto} from './DataAnalysis.model';
import {ReportDto} from './Report.model';
import {LaboratoryAntibioticDto} from './LaboratoryAntibiotic.model';
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
    public dataAnalysis: DataAnalysisDto ;
    public dataArchive: DataArchiveDto ;
    public report: ReportDto ;
     public laboratoryAntibiotics: Array<LaboratoryAntibioticDto>;
     public alerts: Array<AlertDto>;
     public notifications: Array<NotificationDto>;

}
