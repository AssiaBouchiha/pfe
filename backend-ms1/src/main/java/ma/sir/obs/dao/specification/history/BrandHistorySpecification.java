package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.obs.bean.history.BrandHistory;


public class BrandHistorySpecification extends AbstractHistorySpecification<BrandHistoryCriteria, BrandHistory> {

    public BrandHistorySpecification(BrandHistoryCriteria criteria) {
        super(criteria);
    }

    public BrandHistorySpecification(BrandHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
