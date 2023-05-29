package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.SpecimenCriteria;
import ma.sir.obs.bean.core.Specimen;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SpecimenSpecification extends  AbstractSpecification<SpecimenCriteria, Specimen>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("date", criteria.getDate(), criteria.getDateFrom(), criteria.getDateTo());
        addPredicate("type", criteria.getType(),criteria.getTypeLike());
        addPredicateFk("reason","id", criteria.getReason()==null?null:criteria.getReason().getId());
        addPredicateFk("reason","id", criteria.getReasons());
        addPredicateFk("reason","code", criteria.getReason()==null?null:criteria.getReason().getCode());
    }

    public SpecimenSpecification(SpecimenCriteria criteria) {
        super(criteria);
    }

    public SpecimenSpecification(SpecimenCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
