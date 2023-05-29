package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.MicrobiologyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MicrobiologyHistoryDao extends AbstractHistoryRepository<MicrobiologyHistory,Long> {

}
