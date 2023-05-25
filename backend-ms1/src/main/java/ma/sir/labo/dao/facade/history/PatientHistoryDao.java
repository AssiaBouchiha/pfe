package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.PatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryDao extends AbstractHistoryRepository<PatientHistory,Long> {

}
