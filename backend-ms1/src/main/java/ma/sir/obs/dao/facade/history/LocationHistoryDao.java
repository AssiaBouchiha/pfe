package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.LocationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationHistoryDao extends AbstractHistoryRepository<LocationHistory,Long> {

}
