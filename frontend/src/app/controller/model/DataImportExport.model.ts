import {LocationDataDto} from './LocationData.model';
import {MicrobiologyDto} from './Microbiology.model';
import {SpecimenDto} from './Specimen.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class DataImportExportDto  extends BaseDto{

    public id: number;
    public code: string;
    public locationData: LocationDataDto ;
    public specimen: SpecimenDto ;
    public microbiology: MicrobiologyDto ;

}
