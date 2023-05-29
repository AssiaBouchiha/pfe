import {DepartmentCriteria} from './DepartmentCriteria.model';
import {InstitutionCriteria} from './InstitutionCriteria.model';
import {LocationTypeCriteria} from './LocationTypeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class LocationDataCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public dateOfAdmission: Date;
    public dateOfAdmissionFrom: Date;
    public dateOfAdmissionTo: Date;
    public location: string;
    public locationLike: string;
  public institution: InstitutionCriteria ;
  public institutions: Array<InstitutionCriteria> ;
  public department: DepartmentCriteria ;
  public departments: Array<DepartmentCriteria> ;
  public locationType: LocationTypeCriteria ;
  public locationTypes: Array<LocationTypeCriteria> ;

}
