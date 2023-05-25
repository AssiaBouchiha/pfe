package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.labo.bean.history.PatientHistory;


public class PatientHistorySpecification extends AbstractHistorySpecification<PatientHistoryCriteria, PatientHistory> {

    public PatientHistorySpecification(PatientHistoryCriteria criteria) {
        super(criteria);
    }

    public PatientHistorySpecification(PatientHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
