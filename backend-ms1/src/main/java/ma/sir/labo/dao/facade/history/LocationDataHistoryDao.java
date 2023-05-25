package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.LocationDataHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDataHistoryDao extends AbstractHistoryRepository<LocationDataHistory,Long> {

}
