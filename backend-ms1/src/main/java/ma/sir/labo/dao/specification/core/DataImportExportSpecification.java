package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.DataImportExportCriteria;
import ma.sir.labo.bean.core.DataImportExport;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DataImportExportSpecification extends  AbstractSpecification<DataImportExportCriteria, DataImportExport>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateFk("locationData","id", criteria.getLocationData()==null?null:criteria.getLocationData().getId());
        addPredicateFk("locationData","id", criteria.getLocationDatas());
        addPredicateFk("locationData","code", criteria.getLocationData()==null?null:criteria.getLocationData().getCode());
        addPredicateFk("specimen","id", criteria.getSpecimen()==null?null:criteria.getSpecimen().getId());
        addPredicateFk("specimen","id", criteria.getSpecimens());
        addPredicateFk("specimen","code", criteria.getSpecimen()==null?null:criteria.getSpecimen().getCode());
        addPredicateFk("microbiology","id", criteria.getMicrobiology()==null?null:criteria.getMicrobiology().getId());
        addPredicateFk("microbiology","id", criteria.getMicrobiologys());
        addPredicateFk("microbiology","code", criteria.getMicrobiology()==null?null:criteria.getMicrobiology().getCode());
    }

    public DataImportExportSpecification(DataImportExportCriteria criteria) {
        super(criteria);
    }

    public DataImportExportSpecification(DataImportExportCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
