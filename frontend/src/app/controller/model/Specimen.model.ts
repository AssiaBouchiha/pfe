import {DataImportExportDto} from './DataImportExport.model';
import {ReasonDto} from './Reason.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class SpecimenDto  extends BaseDto{

    public id: number;
    public code: string;
   public date: Date;
    public type: string;
    public dateMax: string ;
    public dateMin: string ;
    public reason: ReasonDto ;
    public dataImportExport: DataImportExportDto ;

}
