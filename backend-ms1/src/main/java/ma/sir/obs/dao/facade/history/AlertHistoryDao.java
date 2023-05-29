package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.AlertHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertHistoryDao extends AbstractHistoryRepository<AlertHistory,Long> {

}
