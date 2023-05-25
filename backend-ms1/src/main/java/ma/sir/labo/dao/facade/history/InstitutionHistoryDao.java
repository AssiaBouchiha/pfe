package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.InstitutionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionHistoryDao extends AbstractHistoryRepository<InstitutionHistory,Long> {

}
