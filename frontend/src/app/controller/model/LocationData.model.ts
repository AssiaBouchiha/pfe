import {DepartmentDto} from './Department.model';
import {DataImportExportDto} from './DataImportExport.model';
import {InstitutionDto} from './Institution.model';
import {LocationTypeDto} from './LocationType.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class LocationDataDto  extends BaseDto{

    public id: number;
    public code: string;
   public dateOfAdmission: Date;
    public location: string;
    public dateOfAdmissionMax: string ;
    public dateOfAdmissionMin: string ;
    public institution: InstitutionDto ;
    public department: DepartmentDto ;
    public locationType: LocationTypeDto ;
    public dataImportExport: DataImportExportDto ;

}
