package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.obs.bean.history.GenderHistory;


public class GenderHistorySpecification extends AbstractHistorySpecification<GenderHistoryCriteria, GenderHistory> {

    public GenderHistorySpecification(GenderHistoryCriteria criteria) {
        super(criteria);
    }

    public GenderHistorySpecification(GenderHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
