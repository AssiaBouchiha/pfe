import {LaboratoryDto} from './Laboratory.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class DataArchiveDto  extends BaseDto{

    public id: number;
    public code: string;
    public nom: string;
    public laboratory: LaboratoryDto ;

}
