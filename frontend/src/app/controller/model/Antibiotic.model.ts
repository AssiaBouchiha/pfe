import {MicrobiologyDto} from './Microbiology.model';
import {LaboratoryAntibioticDto} from './LaboratoryAntibiotic.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class AntibioticDto  extends BaseDto{

    public id: number;
    public code: string;
    public nom: string;
    public microbiology: MicrobiologyDto ;
     public laboratoryAntibiotics: Array<LaboratoryAntibioticDto>;

}
