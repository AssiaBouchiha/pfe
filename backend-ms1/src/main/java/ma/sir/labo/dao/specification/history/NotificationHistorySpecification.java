package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.labo.bean.history.NotificationHistory;


public class NotificationHistorySpecification extends AbstractHistorySpecification<NotificationHistoryCriteria, NotificationHistory> {

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria) {
        super(criteria);
    }

    public NotificationHistorySpecification(NotificationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
