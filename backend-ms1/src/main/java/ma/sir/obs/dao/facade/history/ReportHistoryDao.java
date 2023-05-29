package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.ReportHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportHistoryDao extends AbstractHistoryRepository<ReportHistory,Long> {

}
