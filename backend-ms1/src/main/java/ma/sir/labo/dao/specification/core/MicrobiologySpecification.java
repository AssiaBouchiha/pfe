package  ma.sir.labo.dao.specification.core;

import ma.sir.labo.zynerator.specification.AbstractSpecification;
import ma.sir.labo.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.labo.bean.core.Microbiology;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MicrobiologySpecification extends  AbstractSpecification<MicrobiologyCriteria, Microbiology>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("betalactamase", criteria.getBetalactamase(),criteria.getBetalactamaseLike());
        addPredicate("esbl", criteria.getEsbl(),criteria.getEsblLike());
        addPredicate("carbapenemase", criteria.getCarbapenemase(),criteria.getCarbapenemaseLike());
        addPredicate("mrsa", criteria.getMrsa(),criteria.getMrsaLike());
        addPredicate("inducibleClindamycinResistance", criteria.getInducibleClindamycinResistance(),criteria.getInducibleClindamycinResistanceLike());
        addPredicateFk("organism","id", criteria.getOrganism()==null?null:criteria.getOrganism().getId());
        addPredicateFk("organism","id", criteria.getOrganisms());
        addPredicateFk("organism","code", criteria.getOrganism()==null?null:criteria.getOrganism().getCode());
        addPredicateFk("seroType","id", criteria.getSeroType()==null?null:criteria.getSeroType().getId());
        addPredicateFk("seroType","id", criteria.getSeroTypes());
        addPredicateFk("seroType","code", criteria.getSeroType()==null?null:criteria.getSeroType().getCode());
        addPredicateFk("antibiotic","id", criteria.getAntibiotic()==null?null:criteria.getAntibiotic().getId());
        addPredicateFk("antibiotic","id", criteria.getAntibiotics());
        addPredicateFk("antibiotic","code", criteria.getAntibiotic()==null?null:criteria.getAntibiotic().getCode());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getId());
        addPredicateFk("dataImportExport","id", criteria.getDataImportExports());
        addPredicateFk("dataImportExport","code", criteria.getDataImportExport()==null?null:criteria.getDataImportExport().getCode());
    }

    public MicrobiologySpecification(MicrobiologyCriteria criteria) {
        super(criteria);
    }

    public MicrobiologySpecification(MicrobiologyCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
