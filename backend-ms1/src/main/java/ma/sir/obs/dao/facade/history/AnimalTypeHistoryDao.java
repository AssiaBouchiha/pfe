package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.AnimalTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalTypeHistoryDao extends AbstractHistoryRepository<AnimalTypeHistory,Long> {

}
