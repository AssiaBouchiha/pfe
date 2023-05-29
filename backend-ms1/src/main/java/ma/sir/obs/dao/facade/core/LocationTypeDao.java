package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.LocationType;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.LocationType;
import java.util.List;


@Repository
public interface LocationTypeDao extends AbstractRepository<LocationType,Long>  {
    LocationType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW LocationType(item.id,item.libelle) FROM LocationType item")
    List<LocationType> findAllOptimized();
}
