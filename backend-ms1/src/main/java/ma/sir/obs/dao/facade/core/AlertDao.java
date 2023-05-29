package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Alert;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Alert;
import java.util.List;


@Repository
public interface AlertDao extends AbstractRepository<Alert,Long>  {
    Alert findByCode(String code);
    int deleteByCode(String code);

    List<Alert> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW Alert(item.id,item.code) FROM Alert item")
    List<Alert> findAllOptimized();
}
