package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AgeCategoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AgeCategoryHistoryDao extends AbstractHistoryRepository<AgeCategoryHistory,Long> {

}
