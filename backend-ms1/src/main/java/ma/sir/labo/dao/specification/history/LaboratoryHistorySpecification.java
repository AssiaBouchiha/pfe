package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.labo.bean.history.LaboratoryHistory;


public class LaboratoryHistorySpecification extends AbstractHistorySpecification<LaboratoryHistoryCriteria, LaboratoryHistory> {

    public LaboratoryHistorySpecification(LaboratoryHistoryCriteria criteria) {
        super(criteria);
    }

    public LaboratoryHistorySpecification(LaboratoryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
