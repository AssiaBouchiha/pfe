package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.MicrobiologyHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface MicrobiologyHistoryDao extends AbstractHistoryRepository<MicrobiologyHistory,Long> {

}
