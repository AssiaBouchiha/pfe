package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.DataAnalysisHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DataAnalysisHistoryDao extends AbstractHistoryRepository<DataAnalysisHistory,Long> {

}
