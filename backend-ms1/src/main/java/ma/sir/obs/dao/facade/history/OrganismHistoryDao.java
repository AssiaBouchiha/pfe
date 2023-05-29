package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.OrganismHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismHistoryDao extends AbstractHistoryRepository<OrganismHistory,Long> {

}
