import {OrganismDto} from './Organism.model';
import {DataImportExportDto} from './DataImportExport.model';
import {SeroTypeDto} from './SeroType.model';
import {AntibioticDto} from './Antibiotic.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class MicrobiologyDto  extends BaseDto{

    public id: number;
    public code: string;
    public betalactamase: string;
    public esbl: string;
    public carbapenemase: string;
    public mrsa: string;
    public inducibleClindamycinResistance: string;
    public organism: OrganismDto ;
    public seroType: SeroTypeDto ;
    public antibiotic: AntibioticDto ;
    public dataImportExport: DataImportExportDto ;

}
