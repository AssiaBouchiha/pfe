package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.labo.bean.history.LocationHistory;


public class LocationHistorySpecification extends AbstractHistorySpecification<LocationHistoryCriteria, LocationHistory> {

    public LocationHistorySpecification(LocationHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationHistorySpecification(LocationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
