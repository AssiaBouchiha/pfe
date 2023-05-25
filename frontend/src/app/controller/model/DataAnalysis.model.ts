import {LaboratoryDto} from './Laboratory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class DataAnalysisDto  extends BaseDto{

    public id: number;
    public code: string;
    public format: string;
    public laboratory: LaboratoryDto ;

}
