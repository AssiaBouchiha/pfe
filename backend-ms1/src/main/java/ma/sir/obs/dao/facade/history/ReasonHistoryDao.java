package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.ReasonHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonHistoryDao extends AbstractHistoryRepository<ReasonHistory,Long> {

}
