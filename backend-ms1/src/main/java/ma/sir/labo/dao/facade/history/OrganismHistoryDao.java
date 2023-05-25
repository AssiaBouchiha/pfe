package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.OrganismHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismHistoryDao extends AbstractHistoryRepository<OrganismHistory,Long> {

}
