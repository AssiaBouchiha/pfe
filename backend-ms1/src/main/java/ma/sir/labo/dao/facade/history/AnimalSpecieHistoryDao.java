package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AnimalSpecieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalSpecieHistoryDao extends AbstractHistoryRepository<AnimalSpecieHistory,Long> {

}
