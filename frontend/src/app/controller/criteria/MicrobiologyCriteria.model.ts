import {OrganismCriteria} from './OrganismCriteria.model';
import {SeroTypeCriteria} from './SeroTypeCriteria.model';
import {AntibioticCriteria} from './AntibioticCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class MicrobiologyCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public betalactamase: string;
    public betalactamaseLike: string;
    public esbl: string;
    public esblLike: string;
    public carbapenemase: string;
    public carbapenemaseLike: string;
    public mrsa: string;
    public mrsaLike: string;
    public inducibleClindamycinResistance: string;
    public inducibleClindamycinResistanceLike: string;
  public organism: OrganismCriteria ;
  public organisms: Array<OrganismCriteria> ;
  public seroType: SeroTypeCriteria ;
  public seroTypes: Array<SeroTypeCriteria> ;
  public antibiotic: AntibioticCriteria ;
  public antibiotics: Array<AntibioticCriteria> ;

}
