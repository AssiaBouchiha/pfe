import {LaboratoryCriteria} from './LaboratoryCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class AlertCriteria  extends   BaseCriteria  {

    public id: number;
    public code: string;
    public codeLike: string;
    public description: string;
    public descriptionLike: string;
    public nom: string;
    public nomLike: string;
  public laboratory: LaboratoryCriteria ;
  public laboratorys: Array<LaboratoryCriteria> ;

}
