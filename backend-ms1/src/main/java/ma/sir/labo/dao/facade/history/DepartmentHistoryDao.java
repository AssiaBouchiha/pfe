package ma.sir.labo.dao.facade.history;

import ma.sir.labo.zynerator.repository.AbstractHistoryRepository;
import ma.sir.labo.bean.history.DepartmentHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentHistoryDao extends AbstractHistoryRepository<DepartmentHistory,Long> {

}
