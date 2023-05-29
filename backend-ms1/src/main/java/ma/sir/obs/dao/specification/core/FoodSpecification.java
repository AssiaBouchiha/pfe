package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.FoodCriteria;
import ma.sir.obs.bean.core.Food;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FoodSpecification extends  AbstractSpecification<FoodCriteria, Food>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("animalSpecie","id", criteria.getAnimalSpecie()==null?null:criteria.getAnimalSpecie().getId());
        addPredicateFk("animalSpecie","id", criteria.getAnimalSpecies());
        addPredicateFk("animalSpecie","code", criteria.getAnimalSpecie()==null?null:criteria.getAnimalSpecie().getCode());
        addPredicateFk("marketCategory","id", criteria.getMarketCategory()==null?null:criteria.getMarketCategory().getId());
        addPredicateFk("marketCategory","id", criteria.getMarketCategorys());
        addPredicateFk("marketCategory","code", criteria.getMarketCategory()==null?null:criteria.getMarketCategory().getCode());
        addPredicateFk("brand","id", criteria.getBrand()==null?null:criteria.getBrand().getId());
        addPredicateFk("brand","id", criteria.getBrands());
        addPredicateFk("brand","code", criteria.getBrand()==null?null:criteria.getBrand().getCode());
    }

    public FoodSpecification(FoodCriteria criteria) {
        super(criteria);
    }

    public FoodSpecification(FoodCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
