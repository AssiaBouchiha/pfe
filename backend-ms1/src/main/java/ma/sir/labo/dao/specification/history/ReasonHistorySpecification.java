package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.ReasonHistoryCriteria;
import ma.sir.labo.bean.history.ReasonHistory;


public class ReasonHistorySpecification extends AbstractHistorySpecification<ReasonHistoryCriteria, ReasonHistory> {

    public ReasonHistorySpecification(ReasonHistoryCriteria criteria) {
        super(criteria);
    }

    public ReasonHistorySpecification(ReasonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
