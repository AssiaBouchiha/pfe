package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.NotificationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationHistoryDao extends AbstractHistoryRepository<NotificationHistory,Long> {

}
