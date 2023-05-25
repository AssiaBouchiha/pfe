package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.labo.bean.history.AnimalTypeHistory;


public class AnimalTypeHistorySpecification extends AbstractHistorySpecification<AnimalTypeHistoryCriteria, AnimalTypeHistory> {

    public AnimalTypeHistorySpecification(AnimalTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalTypeHistorySpecification(AnimalTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
