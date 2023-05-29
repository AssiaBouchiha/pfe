package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.EnvironmentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentHistoryDao extends AbstractHistoryRepository<EnvironmentHistory,Long> {

}
