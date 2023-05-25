package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.LocationDataCriteria;
import ma.sir.labo.bean.core.LocationData;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LocationDataSpecification extends  AbstractSpecification<LocationDataCriteria, LocationData>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("dateOfAdmission", criteria.getDateOfAdmission(), criteria.getDateOfAdmissionFrom(), criteria.getDateOfAdmissionTo());
        addPredicate("location", criteria.getLocation(),criteria.getLocationLike());
        addPredicateFk("institution","id", criteria.getInstitution()==null?null:criteria.getInstitution().getId());
        addPredicateFk("institution","id", criteria.getInstitutions());
        addPredicateFk("institution","code", criteria.getInstitution()==null?null:criteria.getInstitution().getCode());
        addPredicateFk("department","id", criteria.getDepartment()==null?null:criteria.getDepartment().getId());
        addPredicateFk("department","id", criteria.getDepartments());
        addPredicateFk("department","code", criteria.getDepartment()==null?null:criteria.getDepartment().getCode());
        addPredicateFk("locationType","id", criteria.getLocationType()==null?null:criteria.getLocationType().getId());
        addPredicateFk("locationType","id", criteria.getLocationTypes());
        addPredicateFk("locationType","code", criteria.getLocationType()==null?null:criteria.getLocationType().getCode());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getId());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExports());
        addPredicateFk("dataImportExport","code", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getCode());
    }

    public LocationDataSpecification(LocationDataCriteria criteria) {
        super(criteria);
    }

    public LocationDataSpecification(LocationDataCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
