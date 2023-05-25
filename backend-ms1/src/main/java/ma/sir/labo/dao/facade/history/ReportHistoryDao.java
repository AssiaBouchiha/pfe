package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.ReportHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportHistoryDao extends AbstractHistoryRepository<ReportHistory,Long> {

}
