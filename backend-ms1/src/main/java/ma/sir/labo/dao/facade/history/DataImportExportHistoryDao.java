package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.DataImportExportHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DataImportExportHistoryDao extends AbstractHistoryRepository<DataImportExportHistory,Long> {

}
