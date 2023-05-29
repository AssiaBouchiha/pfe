package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.InstitutionCriteria;
import ma.sir.obs.bean.core.Institution;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class InstitutionSpecification extends  AbstractSpecification<InstitutionCriteria, Institution>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public InstitutionSpecification(InstitutionCriteria criteria) {
        super(criteria);
    }

    public InstitutionSpecification(InstitutionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
