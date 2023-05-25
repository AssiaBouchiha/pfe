package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.EnvironmentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentHistoryDao extends AbstractHistoryRepository<EnvironmentHistory,Long> {

}
