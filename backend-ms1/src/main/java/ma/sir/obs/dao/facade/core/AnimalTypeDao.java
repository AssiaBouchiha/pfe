package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.AnimalType;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.AnimalType;
import java.util.List;


@Repository
public interface AnimalTypeDao extends AbstractRepository<AnimalType,Long>  {
    AnimalType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW AnimalType(item.id,item.libelle) FROM AnimalType item")
    List<AnimalType> findAllOptimized();
}
