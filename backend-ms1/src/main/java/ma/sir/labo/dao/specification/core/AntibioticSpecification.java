package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.AntibioticCriteria;
import ma.sir.labo.bean.core.Antibiotic;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AntibioticSpecification extends  AbstractSpecification<AntibioticCriteria, Antibiotic>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicateFk("microbiology","id", criteria.getMicrobiology()==null?null:criteria.getMicrobiology().getId());
        addPredicateFk("microbiology","id", criteria.getMicrobiologys());
        addPredicateFk("microbiology","code", criteria.getMicrobiology()==null?null:criteria.getMicrobiology().getCode());
    }

    public AntibioticSpecification(AntibioticCriteria criteria) {
        super(criteria);
    }

    public AntibioticSpecification(AntibioticCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
