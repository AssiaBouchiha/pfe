package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.ReasonHistoryCriteria;
import ma.sir.obs.bean.history.ReasonHistory;


public class ReasonHistorySpecification extends AbstractHistorySpecification<ReasonHistoryCriteria, ReasonHistory> {

    public ReasonHistorySpecification(ReasonHistoryCriteria criteria) {
        super(criteria);
    }

    public ReasonHistorySpecification(ReasonHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
