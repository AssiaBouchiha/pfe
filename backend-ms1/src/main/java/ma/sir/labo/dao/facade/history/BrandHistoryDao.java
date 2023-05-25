package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.BrandHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandHistoryDao extends AbstractHistoryRepository<BrandHistory,Long> {

}
