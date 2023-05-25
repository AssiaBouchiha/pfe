package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.labo.bean.history.ReportHistory;


public class ReportHistorySpecification extends AbstractHistorySpecification<ReportHistoryCriteria, ReportHistory> {

    public ReportHistorySpecification(ReportHistoryCriteria criteria) {
        super(criteria);
    }

    public ReportHistorySpecification(ReportHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
