package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.labo.bean.history.LocationDataHistory;


public class LocationDataHistorySpecification extends AbstractHistorySpecification<LocationDataHistoryCriteria, LocationDataHistory> {

    public LocationDataHistorySpecification(LocationDataHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationDataHistorySpecification(LocationDataHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
