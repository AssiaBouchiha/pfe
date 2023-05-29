package  ma.sir.obs.dao.specification.core;

import ma.sir.obs.zynerator.specification.AbstractSpecification;
import ma.sir.obs.dao.criteria.core.DataArchiveCriteria;
import ma.sir.obs.bean.core.DataArchive;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DataArchiveSpecification extends  AbstractSpecification<DataArchiveCriteria, DataArchive>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicateFk("laboratory","id", criteria.getLaboratory()==null?null:criteria.getLaboratory().getId());
        addPredicateFk("laboratory","id", criteria.getLaboratorys());
        addPredicateFk("laboratory","code", criteria.getLaboratory()==null?null:criteria.getLaboratory().getCode());
    }

    public DataArchiveSpecification(DataArchiveCriteria criteria) {
        super(criteria);
    }

    public DataArchiveSpecification(DataArchiveCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
