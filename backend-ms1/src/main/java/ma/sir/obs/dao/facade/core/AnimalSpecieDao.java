package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.AnimalSpecie;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.AnimalSpecie;
import java.util.List;


@Repository
public interface AnimalSpecieDao extends AbstractRepository<AnimalSpecie,Long>  {
    AnimalSpecie findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW AnimalSpecie(item.id,item.libelle) FROM AnimalSpecie item")
    List<AnimalSpecie> findAllOptimized();
}
