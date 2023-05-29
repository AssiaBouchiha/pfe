import {AgeCategoryDto} from './AgeCategory.model';
import {GenderDto} from './Gender.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PatientDto  extends BaseDto{

    public id: number;
    public code: string;
    public lastname: string;
    public firstname: string;
   public dateofbirth: Date;
    public age: string;
    public dateofbirthMax: string ;
    public dateofbirthMin: string ;
    public gender: GenderDto ;
    public ageCategory: AgeCategoryDto ;

}
