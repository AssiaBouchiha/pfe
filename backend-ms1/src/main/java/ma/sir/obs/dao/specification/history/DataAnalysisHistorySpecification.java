package  ma.sir.obs.dao.specification.history;

import ma.sir.obs.zynerator.specification.AbstractHistorySpecification;
import ma.sir.obs.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.obs.bean.history.DataAnalysisHistory;


public class DataAnalysisHistorySpecification extends AbstractHistorySpecification<DataAnalysisHistoryCriteria, DataAnalysisHistory> {

    public DataAnalysisHistorySpecification(DataAnalysisHistoryCriteria criteria) {
        super(criteria);
    }

    public DataAnalysisHistorySpecification(DataAnalysisHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
