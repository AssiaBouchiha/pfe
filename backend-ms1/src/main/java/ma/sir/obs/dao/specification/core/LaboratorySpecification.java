package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.LaboratoryCriteria;
import ma.sir.obs.bean.core.Laboratory;

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
        addPredicateFk("dataAnalysis","id", criteria.getDataAnalysis()==null?null:criteria.getDataAnalysis().getId());
        addPredicateFk("dataAnalysis","id", criteria.getDataAnalysiss());
        addPredicateFk("dataAnalysis","code", criteria.getDataAnalysis()==null?null:criteria.getDataAnalysis().getCode());
        addPredicateFk("dataArchive","id", criteria.getDataArchive()==null?null:criteria.getDataArchive().getId());
        addPredicateFk("dataArchive","id", criteria.getDataArchives());
        addPredicateFk("dataArchive","code", criteria.getDataArchive()==null?null:criteria.getDataArchive().getCode());
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
