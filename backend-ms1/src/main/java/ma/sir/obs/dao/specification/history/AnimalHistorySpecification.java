package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.obs.bean.history.AnimalHistory;


public class AnimalHistorySpecification extends AbstractHistorySpecification<AnimalHistoryCriteria, AnimalHistory> {

    public AnimalHistorySpecification(AnimalHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalHistorySpecification(AnimalHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
