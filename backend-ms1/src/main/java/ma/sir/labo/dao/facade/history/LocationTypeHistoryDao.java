package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.LocationTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationTypeHistoryDao extends AbstractHistoryRepository<LocationTypeHistory,Long> {

}
