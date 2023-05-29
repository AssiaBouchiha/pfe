package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.obs.bean.history.EnvironmentHistory;


public class EnvironmentHistorySpecification extends AbstractHistorySpecification<EnvironmentHistoryCriteria, EnvironmentHistory> {

    public EnvironmentHistorySpecification(EnvironmentHistoryCriteria criteria) {
        super(criteria);
    }

    public EnvironmentHistorySpecification(EnvironmentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
