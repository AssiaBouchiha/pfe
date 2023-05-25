package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Organism;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Organism;
import java.util.List;


@Repository
public interface OrganismDao extends AbstractRepository<Organism,Long>  {
    Organism findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Organism(item.id,item.libelle) FROM Organism item")
    List<Organism> findAllOptimized();
}
