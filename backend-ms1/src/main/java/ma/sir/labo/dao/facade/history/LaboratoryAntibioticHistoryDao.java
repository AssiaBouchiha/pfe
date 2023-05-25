package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.LaboratoryAntibioticHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratoryAntibioticHistoryDao extends AbstractHistoryRepository<LaboratoryAntibioticHistory,Long> {

}
