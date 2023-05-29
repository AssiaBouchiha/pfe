package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.obs.bean.history.PlantHistory;


public class PlantHistorySpecification extends AbstractHistorySpecification<PlantHistoryCriteria, PlantHistory> {

    public PlantHistorySpecification(PlantHistoryCriteria criteria) {
        super(criteria);
    }

    public PlantHistorySpecification(PlantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
