package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.obs.bean.history.LocationTypeHistory;


public class LocationTypeHistorySpecification extends AbstractHistorySpecification<LocationTypeHistoryCriteria, LocationTypeHistory> {

    public LocationTypeHistorySpecification(LocationTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationTypeHistorySpecification(LocationTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
