package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.LocationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationHistoryDao extends AbstractHistoryRepository<LocationHistory,Long> {

}
