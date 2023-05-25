package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.DataArchiveHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DataArchiveHistoryDao extends AbstractHistoryRepository<DataArchiveHistory,Long> {

}
