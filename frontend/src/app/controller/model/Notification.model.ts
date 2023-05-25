import {LaboratoryDto} from './Laboratory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class NotificationDto  extends BaseDto{

    public id: number;
    public code: string;
    public nom: string;
    public description: string;
    public laboratory: LaboratoryDto ;

}
