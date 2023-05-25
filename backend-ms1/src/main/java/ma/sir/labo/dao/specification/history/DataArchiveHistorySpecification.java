package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.labo.bean.history.DataArchiveHistory;


public class DataArchiveHistorySpecification extends AbstractHistorySpecification<DataArchiveHistoryCriteria, DataArchiveHistory> {

    public DataArchiveHistorySpecification(DataArchiveHistoryCriteria criteria) {
        super(criteria);
    }

    public DataArchiveHistorySpecification(DataArchiveHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
