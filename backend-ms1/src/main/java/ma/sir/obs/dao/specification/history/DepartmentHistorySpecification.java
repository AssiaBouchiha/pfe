package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.obs.bean.history.DepartmentHistory;


public class DepartmentHistorySpecification extends AbstractHistorySpecification<DepartmentHistoryCriteria, DepartmentHistory> {

    public DepartmentHistorySpecification(DepartmentHistoryCriteria criteria) {
        super(criteria);
    }

    public DepartmentHistorySpecification(DepartmentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
