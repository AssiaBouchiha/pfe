import {MicrobiologyCriteria} from './MicrobiologyCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class AntibioticCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public nom: string;
    public nomLike: string;
  public microbiology: MicrobiologyCriteria ;
  public microbiologys: Array<MicrobiologyCriteria> ;

}
