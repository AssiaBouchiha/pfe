package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.obs.bean.history.NotificationHistory;


public class NotificationHistorySpecification extends AbstractHistorySpecification<NotificationHistoryCriteria, NotificationHistory> {

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria) {
        super(criteria);
    }

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
