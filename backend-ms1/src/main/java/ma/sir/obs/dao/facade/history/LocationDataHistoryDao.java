package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.LocationDataHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDataHistoryDao extends AbstractHistoryRepository<LocationDataHistory,Long> {

}
