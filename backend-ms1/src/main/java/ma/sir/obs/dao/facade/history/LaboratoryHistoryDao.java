package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.LaboratoryHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryHistoryDao extends AbstractHistoryRepository<LaboratoryHistory,Long> {

}
