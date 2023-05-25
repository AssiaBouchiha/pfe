package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.GenderHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderHistoryDao extends AbstractHistoryRepository<GenderHistory,Long> {

}
