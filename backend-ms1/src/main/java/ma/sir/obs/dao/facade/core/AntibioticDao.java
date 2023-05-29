package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Antibiotic;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Antibiotic;
import java.util.List;


@Repository
public interface AntibioticDao extends AbstractRepository<Antibiotic,Long>  {
    Antibiotic findByCode(String code);
    int deleteByCode(String code);

    List<Antibiotic> findByMicrobiologyId(Long id);
    int deleteByMicrobiologyId(Long id);

    @Query("SELECT NEW Antibiotic(item.id,item.code) FROM Antibiotic item")
    List<Antibiotic> findAllOptimized();
}
