package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.FoodHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodHistoryDao extends AbstractHistoryRepository<FoodHistory,Long> {

}
