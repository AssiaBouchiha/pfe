import {DepartmentDto} from './Department.model';
import {InstitutionDto} from './Institution.model';
import {LaboratoryDto} from './Laboratory.model';
import {LocationTypeDto} from './LocationType.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class LocationDto  extends BaseDto{

    public id: number;
    public code: string;
    public description: string;
    public institution: InstitutionDto ;
    public department: DepartmentDto ;
    public locationType: LocationTypeDto ;
    public laboratory: LaboratoryDto ;

}
