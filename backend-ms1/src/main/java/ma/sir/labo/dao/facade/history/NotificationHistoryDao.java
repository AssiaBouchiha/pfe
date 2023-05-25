package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.NotificationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationHistoryDao extends AbstractHistoryRepository<NotificationHistory,Long> {

}
