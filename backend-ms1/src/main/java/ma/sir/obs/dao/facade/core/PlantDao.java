package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Plant;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Plant;
import java.util.List;


@Repository
public interface PlantDao extends AbstractRepository<Plant,Long>  {
    Plant findByCode(String code);
    int deleteByCode(String code);

    List<Plant> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Plant> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);

    @Query("SELECT NEW Plant(item.id,item.code) FROM Plant item")
    List<Plant> findAllOptimized();
}
