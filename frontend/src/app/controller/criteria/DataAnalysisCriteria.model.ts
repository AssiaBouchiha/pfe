import {LaboratoryCriteria} from './LaboratoryCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class DataAnalysisCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public format: string;
    public formatLike: string;
  public laboratory: LaboratoryCriteria ;
  public laboratorys: Array<LaboratoryCriteria> ;

}
