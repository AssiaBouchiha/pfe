package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.obs.bean.history.InstitutionHistory;


public class InstitutionHistorySpecification extends AbstractHistorySpecification<InstitutionHistoryCriteria, InstitutionHistory> {

    public InstitutionHistorySpecification(InstitutionHistoryCriteria criteria) {
        super(criteria);
    }

    public InstitutionHistorySpecification(InstitutionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
