package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.obs.bean.history.LocationHistory;


public class LocationHistorySpecification extends AbstractHistorySpecification<LocationHistoryCriteria, LocationHistory> {

    public LocationHistorySpecification(LocationHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationHistorySpecification(LocationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
