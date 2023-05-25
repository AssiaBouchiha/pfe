package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AnimalHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalHistoryDao extends AbstractHistoryRepository<AnimalHistory,Long> {

}
