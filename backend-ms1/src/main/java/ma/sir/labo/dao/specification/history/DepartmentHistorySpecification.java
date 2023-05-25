package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.labo.bean.history.DepartmentHistory;


public class DepartmentHistorySpecification extends AbstractHistorySpecification<DepartmentHistoryCriteria, DepartmentHistory> {

    public DepartmentHistorySpecification(DepartmentHistoryCriteria criteria) {
        super(criteria);
    }

    public DepartmentHistorySpecification(DepartmentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
