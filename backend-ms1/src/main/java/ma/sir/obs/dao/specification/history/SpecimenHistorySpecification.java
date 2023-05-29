package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.obs.bean.history.SpecimenHistory;


public class SpecimenHistorySpecification extends AbstractHistorySpecification<SpecimenHistoryCriteria, SpecimenHistory> {

    public SpecimenHistorySpecification(SpecimenHistoryCriteria criteria) {
        super(criteria);
    }

    public SpecimenHistorySpecification(SpecimenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
