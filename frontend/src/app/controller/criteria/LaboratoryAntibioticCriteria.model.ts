import {LaboratoryCriteria} from './LaboratoryCriteria.model';
import {AntibioticCriteria} from './AntibioticCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class LaboratoryAntibioticCriteria  extends   BaseCriteria  {

    public id: number;
  public laboratory: LaboratoryCriteria ;
  public laboratorys: Array<LaboratoryCriteria> ;
  public antibiotic: AntibioticCriteria ;
  public antibiotics: Array<AntibioticCriteria> ;

}
