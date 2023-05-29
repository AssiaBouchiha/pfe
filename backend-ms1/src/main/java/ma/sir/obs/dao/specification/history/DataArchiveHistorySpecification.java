package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.obs.bean.history.DataArchiveHistory;


public class DataArchiveHistorySpecification extends AbstractHistorySpecification<DataArchiveHistoryCriteria, DataArchiveHistory> {

    public DataArchiveHistorySpecification(DataArchiveHistoryCriteria criteria) {
        super(criteria);
    }

    public DataArchiveHistorySpecification(DataArchiveHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
