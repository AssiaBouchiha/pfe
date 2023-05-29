package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.PlantCriteria;
import ma.sir.obs.bean.core.Plant;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PlantSpecification extends  AbstractSpecification<PlantCriteria, Plant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("lastname", criteria.getLastname(),criteria.getLastnameLike());
        addPredicate("firstname", criteria.getFirstname(),criteria.getFirstnameLike());
        addPredicate("dateofbirth", criteria.getDateofbirth(), criteria.getDateofbirthFrom(), criteria.getDateofbirthTo());
        addPredicate("age", criteria.getAge(),criteria.getAgeLike());
        addPredicateFk("gender","id", criteria.getGender()==null?null:criteria.getGender().getId());
        addPredicateFk("gender","id", criteria.getGenders());
        addPredicateFk("gender","code", criteria.getGender()==null?null:criteria.getGender().getCode());
        addPredicateFk("ageCategory","id", criteria.getAgeCategory()==null?null:criteria.getAgeCategory().getId());
        addPredicateFk("ageCategory","id", criteria.getAgeCategorys());
        addPredicateFk("ageCategory","code", criteria.getAgeCategory()==null?null:criteria.getAgeCategory().getCode());
    }

    public PlantSpecification(PlantCriteria criteria) {
        super(criteria);
    }

    public PlantSpecification(PlantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
