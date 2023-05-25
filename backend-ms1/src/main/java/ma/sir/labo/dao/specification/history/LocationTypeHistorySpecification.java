package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.labo.bean.history.LocationTypeHistory;


public class LocationTypeHistorySpecification extends AbstractHistorySpecification<LocationTypeHistoryCriteria, LocationTypeHistory> {

    public LocationTypeHistorySpecification(LocationTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public LocationTypeHistorySpecification(LocationTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
