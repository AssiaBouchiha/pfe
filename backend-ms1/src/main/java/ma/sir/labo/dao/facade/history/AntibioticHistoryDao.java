package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.AntibioticHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AntibioticHistoryDao extends AbstractHistoryRepository<AntibioticHistory,Long> {

}
