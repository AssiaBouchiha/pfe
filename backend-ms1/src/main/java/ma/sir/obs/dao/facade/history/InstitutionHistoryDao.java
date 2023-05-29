package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.InstitutionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionHistoryDao extends AbstractHistoryRepository<InstitutionHistory,Long> {

}
