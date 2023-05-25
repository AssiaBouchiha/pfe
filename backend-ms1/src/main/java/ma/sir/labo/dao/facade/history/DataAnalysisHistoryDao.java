package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.DataAnalysisHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAnalysisHistoryDao extends AbstractHistoryRepository<DataAnalysisHistory,Long> {

}
