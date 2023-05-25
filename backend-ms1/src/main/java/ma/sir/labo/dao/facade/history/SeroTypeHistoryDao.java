package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.SerotypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SerotypeHistoryDao extends AbstractHistoryRepository<SerotypeHistory,Long> {

}
