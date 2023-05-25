package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.PlantHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantHistoryDao extends AbstractHistoryRepository<PlantHistory,Long> {

}
