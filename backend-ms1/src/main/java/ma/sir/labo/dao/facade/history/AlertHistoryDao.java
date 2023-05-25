package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AlertHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertHistoryDao extends AbstractHistoryRepository<AlertHistory,Long> {

}
