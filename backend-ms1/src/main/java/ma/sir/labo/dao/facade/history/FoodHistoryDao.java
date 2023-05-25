package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.FoodHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodHistoryDao extends AbstractHistoryRepository<FoodHistory,Long> {

}
