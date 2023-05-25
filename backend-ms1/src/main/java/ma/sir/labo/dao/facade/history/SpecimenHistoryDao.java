package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.SpecimenHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecimenHistoryDao extends AbstractHistoryRepository<SpecimenHistory,Long> {

}
