package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.SpecimenHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecimenHistoryDao extends AbstractHistoryRepository<SpecimenHistory,Long> {

}