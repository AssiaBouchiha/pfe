package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.obs.bean.history.FoodHistory;


public class FoodHistorySpecification extends AbstractHistorySpecification<FoodHistoryCriteria, FoodHistory> {

    public FoodHistorySpecification(FoodHistoryCriteria criteria) {
        super(criteria);
    }

    public FoodHistorySpecification(FoodHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
