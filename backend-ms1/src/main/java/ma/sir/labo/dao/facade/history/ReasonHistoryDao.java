package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.ReasonHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonHistoryDao extends AbstractHistoryRepository<ReasonHistory,Long> {

}
