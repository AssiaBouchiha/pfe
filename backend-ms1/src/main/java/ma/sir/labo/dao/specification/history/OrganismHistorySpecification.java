package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.labo.bean.history.OrganismHistory;


public class OrganismHistorySpecification extends AbstractHistorySpecification<OrganismHistoryCriteria, OrganismHistory> {

    public OrganismHistorySpecification(OrganismHistoryCriteria criteria) {
        super(criteria);
    }

    public OrganismHistorySpecification(OrganismHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
