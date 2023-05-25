package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.labo.bean.history.AlertHistory;


public class AlertHistorySpecification extends AbstractHistorySpecification<AlertHistoryCriteria, AlertHistory> {

    public AlertHistorySpecification(AlertHistoryCriteria criteria) {
        super(criteria);
    }

    public AlertHistorySpecification(AlertHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
