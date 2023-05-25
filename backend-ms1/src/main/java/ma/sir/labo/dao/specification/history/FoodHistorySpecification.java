package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.labo.bean.history.FoodHistory;


public class FoodHistorySpecification extends AbstractHistorySpecification<FoodHistoryCriteria, FoodHistory> {

    public FoodHistorySpecification(FoodHistoryCriteria criteria) {
        super(criteria);
    }

    public FoodHistorySpecification(FoodHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
