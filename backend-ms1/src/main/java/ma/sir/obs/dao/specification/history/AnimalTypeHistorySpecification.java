package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.obs.bean.history.AnimalTypeHistory;


public class AnimalTypeHistorySpecification extends AbstractHistorySpecification<AnimalTypeHistoryCriteria, AnimalTypeHistory> {

    public AnimalTypeHistorySpecification(AnimalTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalTypeHistorySpecification(AnimalTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
