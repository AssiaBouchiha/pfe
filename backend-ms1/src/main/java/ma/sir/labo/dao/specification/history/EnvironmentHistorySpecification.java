package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.labo.bean.history.EnvironmentHistory;


public class EnvironmentHistorySpecification extends AbstractHistorySpecification<EnvironmentHistoryCriteria, EnvironmentHistory> {

    public EnvironmentHistorySpecification(EnvironmentHistoryCriteria criteria) {
        super(criteria);
    }

    public EnvironmentHistorySpecification(EnvironmentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
