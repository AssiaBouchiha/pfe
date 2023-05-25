package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.LocationCriteria;
import ma.sir.labo.bean.core.Location;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LocationSpecification extends  AbstractSpecification<LocationCriteria, Location>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateFk("institution","id", criteria.getInstitution()==null?null:criteria.getInstitution().getId());
        addPredicateFk("institution","id", criteria.getInstitutions());
        addPredicateFk("institution","code", criteria.getInstitution()==null?null:criteria.getInstitution().getCode());
        addPredicateFk("department","id", criteria.getDepartment()==null?null:criteria.getDepartment().getId());
        addPredicateFk("department","id", criteria.getDepartments());
        addPredicateFk("department","code", criteria.getDepartment()==null?null:criteria.getDepartment().getCode());
        addPredicateFk("locationType","id", criteria.getLocationType()==null?null:criteria.getLocationType().getId());
        addPredicateFk("locationType","id", criteria.getLocationTypes());
        addPredicateFk("locationType","code", criteria.getLocationType()==null?null:criteria.getLocationType().getCode());
        addPredicateFk("laboratory","id", criteria.getLaboratory()==null?null:criteria.getLaboratory().getId());
        addPredicateFk("laboratory","id", criteria.getLaboratorys());
        addPredicateFk("laboratory","code", criteria.getLaboratory()==null?null:criteria.getLaboratory().getCode());
    }

    public LocationSpecification(LocationCriteria criteria) {
        super(criteria);
    }

    public LocationSpecification(LocationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
