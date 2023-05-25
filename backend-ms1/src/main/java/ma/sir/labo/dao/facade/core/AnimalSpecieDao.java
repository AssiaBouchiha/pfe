package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.AnimalSpecie;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.AnimalSpecie;
import java.util.List;


@Repository
public interface AnimalSpecieDao extends AbstractRepository<AnimalSpecie,Long>  {
    AnimalSpecie findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW AnimalSpecie(item.id,item.libelle) FROM AnimalSpecie item")
    List<AnimalSpecie> findAllOptimized();
}
