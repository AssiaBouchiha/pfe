package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.labo.bean.history.DataAnalysisHistory;


public class DataAnalysisHistorySpecification extends AbstractHistorySpecification<DataAnalysisHistoryCriteria, DataAnalysisHistory> {

    public DataAnalysisHistorySpecification(DataAnalysisHistoryCriteria criteria) {
        super(criteria);
    }

    public DataAnalysisHistorySpecification(DataAnalysisHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
