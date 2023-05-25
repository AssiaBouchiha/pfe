package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.labo.bean.history.MicrobiologyHistory;


public class MicrobiologyHistorySpecification extends AbstractHistorySpecification<MicrobiologyHistoryCriteria, MicrobiologyHistory> {

    public MicrobiologyHistorySpecification(MicrobiologyHistoryCriteria criteria) {
        super(criteria);
    }

    public MicrobiologyHistorySpecification(MicrobiologyHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
