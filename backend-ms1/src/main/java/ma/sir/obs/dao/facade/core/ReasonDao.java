package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Reason;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Reason;
import java.util.List;


@Repository
public interface ReasonDao extends AbstractRepository<Reason,Long>  {
    Reason findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Reason(item.id,item.libelle) FROM Reason item")
    List<Reason> findAllOptimized();
}
