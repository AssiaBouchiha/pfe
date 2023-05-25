package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.labo.bean.history.AnimalSpecieHistory;


public class AnimalSpecieHistorySpecification extends AbstractHistorySpecification<AnimalSpecieHistoryCriteria, AnimalSpecieHistory> {

    public AnimalSpecieHistorySpecification(AnimalSpecieHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalSpecieHistorySpecification(AnimalSpecieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
