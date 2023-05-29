package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.obs.bean.history.PatientHistory;


public class PatientHistorySpecification extends AbstractHistorySpecification<PatientHistoryCriteria, PatientHistory> {

    public PatientHistorySpecification(PatientHistoryCriteria criteria) {
        super(criteria);
    }

    public PatientHistorySpecification(PatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
