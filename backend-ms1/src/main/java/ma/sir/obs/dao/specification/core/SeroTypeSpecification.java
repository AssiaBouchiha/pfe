package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.SeroTypeCriteria;
import ma.sir.obs.bean.core.SeroType;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SeroTypeSpecification extends  AbstractSpecification<SeroTypeCriteria, SeroType>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SeroTypeSpecification(SeroTypeCriteria criteria) {
        super(criteria);
    }

    public SeroTypeSpecification(SeroTypeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
