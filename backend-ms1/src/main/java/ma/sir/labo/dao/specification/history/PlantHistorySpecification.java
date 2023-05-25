package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.labo.bean.history.PlantHistory;


public class PlantHistorySpecification extends AbstractHistorySpecification<PlantHistoryCriteria, PlantHistory> {

    public PlantHistorySpecification(PlantHistoryCriteria criteria) {
        super(criteria);
    }

    public PlantHistorySpecification(PlantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
