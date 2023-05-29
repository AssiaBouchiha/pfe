package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.PlantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantHistoryDao extends AbstractHistoryRepository<PlantHistory,Long> {

}
