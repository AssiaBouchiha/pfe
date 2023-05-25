package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.LaboratoryCriteria;
import ma.sir.labo.bean.core.Laboratory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LaboratorySpecification extends  AbstractSpecification<LaboratoryCriteria, Laboratory>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicateBool("bloqued", criteria.getBloqued());
        addPredicate("city", criteria.getCity(),criteria.getCityLike());
        addPredicateFk("location","id", criteria.getLocation()==null?null:criteria.getLocation().getId());
        addPredicateFk("location","id", criteria.getLocations());
        addPredicateFk("location","code", criteria.getLocation()==null?null:criteria.getLocation().getCode());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getId());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExports());
        addPredicateFk("dataImportExport","code", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getCode());
        addPredicateFk("dataanalysis","id", criteria.getDataanalysis()==null?null:criteria.getDataanalysis().getId());
        addPredicateFk("dataanalysis","id", criteria.getDataanalysiss());
        addPredicateFk("dataanalysis","code", criteria.getDataanalysis()==null?null:criteria.getDataanalysis().getCode());
        addPredicateFk("dataarchive","id", criteria.getDataarchive()==null?null:criteria.getDataarchive().getId());
        addPredicateFk("dataarchive","id", criteria.getDataarchives());
        addPredicateFk("dataarchive","code", criteria.getDataarchive()==null?null:criteria.getDataarchive().getCode());
        addPredicateFk("report","id", criteria.getReport()==null?null:criteria.getReport().getId());
        addPredicateFk("report","id", criteria.getReports());
        addPredicateFk("report","code", criteria.getReport()==null?null:criteria.getReport().getCode());
    }

    public LaboratorySpecification(LaboratoryCriteria criteria) {
        super(criteria);
    }

    public LaboratorySpecification(LaboratoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
