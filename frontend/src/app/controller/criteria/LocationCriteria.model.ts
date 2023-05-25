import {DepartmentCriteria} from './DepartmentCriteria.model';
import {InstitutionCriteria} from './InstitutionCriteria.model';
import {LaboratoryCriteria} from './LaboratoryCriteria.model';
import {LocationTypeCriteria} from './LocationTypeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class LocationCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public description: string;
    public descriptionLike: string;
  public institution: InstitutionCriteria ;
  public institutions: Array<InstitutionCriteria> ;
  public department: DepartmentCriteria ;
  public departments: Array<DepartmentCriteria> ;
  public locationType: LocationTypeCriteria ;
  public locationTypes: Array<LocationTypeCriteria> ;
  public laboratory: LaboratoryCriteria ;
  public laboratorys: Array<LaboratoryCriteria> ;

}
