package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.labo.bean.history.MarketCategoryHistory;


public class MarketCategoryHistorySpecification extends AbstractHistorySpecification<MarketCategoryHistoryCriteria, MarketCategoryHistory> {

    public MarketCategoryHistorySpecification(MarketCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public MarketCategoryHistorySpecification(MarketCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
