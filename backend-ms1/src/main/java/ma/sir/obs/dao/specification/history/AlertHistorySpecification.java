package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.obs.bean.history.AlertHistory;


public class AlertHistorySpecification extends AbstractHistorySpecification<AlertHistoryCriteria, AlertHistory> {

    public AlertHistorySpecification(AlertHistoryCriteria criteria) {
        super(criteria);
    }

    public AlertHistorySpecification(AlertHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
