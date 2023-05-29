package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.obs.bean.core.LaboratoryAntibiotic;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class LaboratoryAntibioticSpecification extends  AbstractSpecification<LaboratoryAntibioticCriteria, LaboratoryAntibiotic>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("laboratory","id", criteria.getLaboratory()==null?null:criteria.getLaboratory().getId());
        addPredicateFk("laboratory","id", criteria.getLaboratorys());
        addPredicateFk("laboratory","code", criteria.getLaboratory()==null?null:criteria.getLaboratory().getCode());
        addPredicateFk("antibiotic","id", criteria.getAntibiotic()==null?null:criteria.getAntibiotic().getId());
        addPredicateFk("antibiotic","id", criteria.getAntibiotics());
        addPredicateFk("antibiotic","code", criteria.getAntibiotic()==null?null:criteria.getAntibiotic().getCode());
    }

    public LaboratoryAntibioticSpecification(LaboratoryAntibioticCriteria criteria) {
        super(criteria);
    }

    public LaboratoryAntibioticSpecification(LaboratoryAntibioticCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
