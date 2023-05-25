package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.labo.bean.history.AgeCategoryHistory;


public class AgeCategoryHistorySpecification extends AbstractHistorySpecification<AgeCategoryHistoryCriteria, AgeCategoryHistory> {

    public AgeCategoryHistorySpecification(AgeCategoryHistoryCriteria criteria) {
        super(criteria);
    }

    public AgeCategoryHistorySpecification(AgeCategoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
