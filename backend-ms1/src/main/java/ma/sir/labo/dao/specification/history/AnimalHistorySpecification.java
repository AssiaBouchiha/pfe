package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.labo.bean.history.AnimalHistory;


public class AnimalHistorySpecification extends AbstractHistorySpecification<AnimalHistoryCriteria, AnimalHistory> {

    public AnimalHistorySpecification(AnimalHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalHistorySpecification(AnimalHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
