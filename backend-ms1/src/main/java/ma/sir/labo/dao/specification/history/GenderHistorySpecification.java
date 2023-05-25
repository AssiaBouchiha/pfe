package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.labo.bean.history.GenderHistory;


public class GenderHistorySpecification extends AbstractHistorySpecification<GenderHistoryCriteria, GenderHistory> {

    public GenderHistorySpecification(GenderHistoryCriteria criteria) {
        super(criteria);
    }

    public GenderHistorySpecification(GenderHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
