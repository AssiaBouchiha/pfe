package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.labo.bean.history.AntibioticHistory;


public class AntibioticHistorySpecification extends AbstractHistorySpecification<AntibioticHistoryCriteria, AntibioticHistory> {

    public AntibioticHistorySpecification(AntibioticHistoryCriteria criteria) {
        super(criteria);
    }

    public AntibioticHistorySpecification(AntibioticHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
