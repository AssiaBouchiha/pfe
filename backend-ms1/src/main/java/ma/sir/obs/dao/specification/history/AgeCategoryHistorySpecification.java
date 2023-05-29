package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.obs.bean.history.AgeCategoryHistory;


public class AgeCategoryHistorySpecification extends AbstractHistorySpecification<AgeCategoryHistoryCriteria, AgeCategoryHistory> {

    public AgeCategoryHistorySpecification(AgeCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public AgeCategoryHistorySpecification(AgeCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
