package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.AnimalHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalHistoryDao extends AbstractHistoryRepository<AnimalHistory,Long> {

}
