import {LaboratoryDto} from './Laboratory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class AlertDto  extends BaseDto{

    public id: number;
    public code: string;
    public description: string;
    public nom: string;
    public laboratory: LaboratoryDto ;

}
