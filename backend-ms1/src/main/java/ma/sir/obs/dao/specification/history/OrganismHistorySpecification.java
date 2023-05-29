package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.obs.bean.history.OrganismHistory;


public class OrganismHistorySpecification extends AbstractHistorySpecification<OrganismHistoryCriteria, OrganismHistory> {

    public OrganismHistorySpecification(OrganismHistoryCriteria criteria) {
        super(criteria);
    }

    public OrganismHistorySpecification(OrganismHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
