package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.SeroType;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.SeroType;
import java.util.List;


@Repository
public interface SeroTypeDao extends AbstractRepository<SeroType,Long>  {
    SeroType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW SeroType(item.id,item.libelle) FROM SeroType item")
    List<SeroType> findAllOptimized();
}
