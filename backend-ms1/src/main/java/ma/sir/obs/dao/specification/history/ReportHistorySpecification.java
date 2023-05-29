package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.obs.bean.history.ReportHistory;


public class ReportHistorySpecification extends AbstractHistorySpecification<ReportHistoryCriteria, ReportHistory> {

    public ReportHistorySpecification(ReportHistoryCriteria criteria) {
        super(criteria);
    }

    public ReportHistorySpecification(ReportHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
