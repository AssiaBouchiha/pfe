package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.SeroTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SeroTypeHistoryDao extends AbstractHistoryRepository<SeroTypeHistory,Long> {

}
