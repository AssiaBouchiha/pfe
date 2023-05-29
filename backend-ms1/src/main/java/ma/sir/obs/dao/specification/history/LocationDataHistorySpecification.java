package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.obs.bean.history.LocationDataHistory;


public class LocationDataHistorySpecification extends AbstractHistorySpecification<LocationDataHistoryCriteria, LocationDataHistory> {

    public LocationDataHistorySpecification(LocationDataHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationDataHistorySpecification(LocationDataHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
