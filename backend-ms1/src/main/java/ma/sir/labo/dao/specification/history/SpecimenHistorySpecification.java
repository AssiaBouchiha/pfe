package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.labo.bean.history.SpecimenHistory;


public class SpecimenHistorySpecification extends AbstractHistorySpecification<SpecimenHistoryCriteria, SpecimenHistory> {

    public SpecimenHistorySpecification(SpecimenHistoryCriteria criteria) {
        super(criteria);
    }

    public SpecimenHistorySpecification(SpecimenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
