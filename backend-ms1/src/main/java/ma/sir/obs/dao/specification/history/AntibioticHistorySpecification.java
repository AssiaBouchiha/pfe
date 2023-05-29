package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.obs.bean.history.AntibioticHistory;


public class AntibioticHistorySpecification extends AbstractHistorySpecification<AntibioticHistoryCriteria, AntibioticHistory> {

    public AntibioticHistorySpecification(AntibioticHistoryCriteria criteria) {
        super(criteria);
    }

    public AntibioticHistorySpecification(AntibioticHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
