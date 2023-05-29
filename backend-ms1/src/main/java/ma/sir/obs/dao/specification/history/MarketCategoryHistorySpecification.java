package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.obs.bean.history.MarketCategoryHistory;


public class MarketCategoryHistorySpecification extends AbstractHistorySpecification<MarketCategoryHistoryCriteria, MarketCategoryHistory> {

    public MarketCategoryHistorySpecification(MarketCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public MarketCategoryHistorySpecification(MarketCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
