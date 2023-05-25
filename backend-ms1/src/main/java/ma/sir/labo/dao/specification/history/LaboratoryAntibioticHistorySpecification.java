package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.labo.bean.history.LaboratoryAntibioticHistory;


public class LaboratoryAntibioticHistorySpecification extends AbstractHistorySpecification<LaboratoryAntibioticHistoryCriteria, LaboratoryAntibioticHistory> {

    public LaboratoryAntibioticHistorySpecification(LaboratoryAntibioticHistoryCriteria criteria) {
        super(criteria);
    }

    public LaboratoryAntibioticHistorySpecification(LaboratoryAntibioticHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
