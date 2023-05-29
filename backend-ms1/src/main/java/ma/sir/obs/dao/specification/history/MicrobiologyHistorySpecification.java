package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.obs.bean.history.MicrobiologyHistory;


public class MicrobiologyHistorySpecification extends AbstractHistorySpecification<MicrobiologyHistoryCriteria, MicrobiologyHistory> {

    public MicrobiologyHistorySpecification(MicrobiologyHistoryCriteria criteria) {
        super(criteria);
    }

    public MicrobiologyHistorySpecification(MicrobiologyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
