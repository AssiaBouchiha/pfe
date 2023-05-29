package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.obs.bean.history.AnimalSpecieHistory;


public class AnimalSpecieHistorySpecification extends AbstractHistorySpecification<AnimalSpecieHistoryCriteria, AnimalSpecieHistory> {

    public AnimalSpecieHistorySpecification(AnimalSpecieHistoryCriteria criteria) {
        super(criteria);
    }

    public AnimalSpecieHistorySpecification(AnimalSpecieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
