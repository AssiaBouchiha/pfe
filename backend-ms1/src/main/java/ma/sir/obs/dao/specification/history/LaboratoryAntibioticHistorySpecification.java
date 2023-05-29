package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.obs.bean.history.LaboratoryAntibioticHistory;


public class LaboratoryAntibioticHistorySpecification extends AbstractHistorySpecification<LaboratoryAntibioticHistoryCriteria, LaboratoryAntibioticHistory> {

    public LaboratoryAntibioticHistorySpecification(LaboratoryAntibioticHistoryCriteria criteria) {
        super(criteria);
    }

    public LaboratoryAntibioticHistorySpecification(LaboratoryAntibioticHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
