package  ma.sir.labo.dao.specification.history;

import ma.sir.labo.zynerator.specification.AbstractHistorySpecification;
import ma.sir.labo.dao.criteria.history.DataImportExportHistoryCriteria;
import ma.sir.labo.bean.history.DataImportExportHistory;


public class DataImportExportHistorySpecification extends AbstractHistorySpecification<DataImportExportHistoryCriteria, DataImportExportHistory> {

    public DataImportExportHistorySpecification(DataImportExportHistoryCriteria criteria) {
        super(criteria);
    }

    public DataImportExportHistorySpecification(DataImportExportHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
