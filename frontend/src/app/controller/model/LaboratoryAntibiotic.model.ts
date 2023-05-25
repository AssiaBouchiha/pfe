import {LaboratoryDto} from './Laboratory.model';
import {AntibioticDto} from './Antibiotic.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class LaboratoryAntibioticDto  extends BaseDto{

    public id: number;
    public laboratory: LaboratoryDto ;
    public antibiotic: AntibioticDto ;

}
