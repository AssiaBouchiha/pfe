package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AnimalTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalTypeHistoryDao extends AbstractHistoryRepository<AnimalTypeHistory,Long> {

}
