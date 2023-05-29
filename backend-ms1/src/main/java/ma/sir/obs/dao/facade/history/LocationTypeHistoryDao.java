package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.LocationTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationTypeHistoryDao extends AbstractHistoryRepository<LocationTypeHistory,Long> {

}
