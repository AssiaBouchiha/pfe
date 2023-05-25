package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.EnvironmentCriteria;
import ma.sir.labo.bean.core.Environment;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EnvironmentSpecification extends  AbstractSpecification<EnvironmentCriteria, Environment>  {

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
        addPredicateFk("dataImportExport","id", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getId());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExports());
        addPredicateFk("dataImportExport","code", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getCode());
    }

    public EnvironmentSpecification(EnvironmentCriteria criteria) {
        super(criteria);
    }

    public EnvironmentSpecification(EnvironmentCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
