package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.labo.bean.history.InstitutionHistory;


public class InstitutionHistorySpecification extends AbstractHistorySpecification<InstitutionHistoryCriteria, InstitutionHistory> {

    public InstitutionHistorySpecification(InstitutionHistoryCriteria criteria) {
        super(criteria);
    }

    public InstitutionHistorySpecification(InstitutionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
