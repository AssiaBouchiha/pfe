package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.SeroTypeHistoryCriteria;
import ma.sir.obs.bean.history.SeroTypeHistory;


public class SeroTypeHistorySpecification extends AbstractHistorySpecification<SeroTypeHistoryCriteria, SeroTypeHistory> {

    public SeroTypeHistorySpecification(SeroTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public SeroTypeHistorySpecification(SeroTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
