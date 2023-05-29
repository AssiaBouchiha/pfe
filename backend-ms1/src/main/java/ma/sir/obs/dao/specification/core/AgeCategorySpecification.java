package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.obs.bean.core.AgeCategory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AgeCategorySpecification extends  AbstractSpecification<AgeCategoryCriteria, AgeCategory>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public AgeCategorySpecification(AgeCategoryCriteria criteria) {
        super(criteria);
    }

    public AgeCategorySpecification(AgeCategoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
