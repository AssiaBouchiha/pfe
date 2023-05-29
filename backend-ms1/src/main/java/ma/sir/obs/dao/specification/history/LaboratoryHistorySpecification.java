package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.obs.bean.history.LaboratoryHistory;


public class LaboratoryHistorySpecification extends AbstractHistorySpecification<LaboratoryHistoryCriteria, LaboratoryHistory> {

    public LaboratoryHistorySpecification(LaboratoryHistoryCriteria criteria) {
        super(criteria);
    }

    public LaboratoryHistorySpecification(LaboratoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
