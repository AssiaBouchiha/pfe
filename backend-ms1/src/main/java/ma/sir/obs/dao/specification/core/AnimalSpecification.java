package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.AnimalCriteria;
import ma.sir.obs.bean.core.Animal;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AnimalSpecification extends  AbstractSpecification<AnimalCriteria, Animal>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("name", criteria.getName(),criteria.getNameLike());
        addPredicate("age", criteria.getAge(),criteria.getAgeLike());
        addPredicateFk("gender","id", criteria.getGender()==null?null:criteria.getGender().getId());
        addPredicateFk("gender","id", criteria.getGenders());
        addPredicateFk("gender","code", criteria.getGender()==null?null:criteria.getGender().getCode());
        addPredicateFk("ageCategory","id", criteria.getAgeCategory()==null?null:criteria.getAgeCategory().getId());
        addPredicateFk("ageCategory","id", criteria.getAgeCategorys());
        addPredicateFk("ageCategory","code", criteria.getAgeCategory()==null?null:criteria.getAgeCategory().getCode());
        addPredicateFk("animalSpecie","id", criteria.getAnimalSpecie()==null?null:criteria.getAnimalSpecie().getId());
        addPredicateFk("animalSpecie","id", criteria.getAnimalSpecies());
        addPredicateFk("animalSpecie","code", criteria.getAnimalSpecie()==null?null:criteria.getAnimalSpecie().getCode());
        addPredicateFk("animalType","id", criteria.getAnimalType()==null?null:criteria.getAnimalType().getId());
        addPredicateFk("animalType","id", criteria.getAnimalTypes());
        addPredicateFk("animalType","code", criteria.getAnimalType()==null?null:criteria.getAnimalType().getCode());
        addPredicateFk("marketCategory","id", criteria.getMarketCategory()==null?null:criteria.getMarketCategory().getId());
        addPredicateFk("marketCategory","id", criteria.getMarketCategorys());
        addPredicateFk("marketCategory","code", criteria.getMarketCategory()==null?null:criteria.getMarketCategory().getCode());
    }

    public AnimalSpecification(AnimalCriteria criteria) {
        super(criteria);
    }

    public AnimalSpecification(AnimalCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
