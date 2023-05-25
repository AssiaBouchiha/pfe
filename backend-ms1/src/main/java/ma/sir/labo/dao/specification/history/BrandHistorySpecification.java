package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.labo.bean.history.BrandHistory;


public class BrandHistorySpecification extends AbstractHistorySpecification<BrandHistoryCriteria, BrandHistory> {

    public BrandHistorySpecification(BrandHistoryCriteria criteria) {
        super(criteria);
    }

    public BrandHistorySpecification(BrandHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
