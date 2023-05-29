package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.MarketCategoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketCategoryHistoryDao extends AbstractHistoryRepository<MarketCategoryHistory,Long> {

}
