package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Antibiotic;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Antibiotic;
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
