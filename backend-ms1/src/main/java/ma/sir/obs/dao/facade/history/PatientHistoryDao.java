package ma.sir.obs.dao.facade.history;

import ma.sir.obs.zynerator.repository.AbstractHistoryRepository;
import ma.sir.obs.bean.history.PatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryDao extends AbstractHistoryRepository<PatientHistory,Long> {

}
