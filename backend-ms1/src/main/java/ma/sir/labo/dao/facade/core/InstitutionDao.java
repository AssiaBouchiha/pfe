package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Institution;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Institution;
import java.util.List;


@Repository
public interface InstitutionDao extends AbstractRepository<Institution,Long>  {
    Institution findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Institution(item.id,item.libelle) FROM Institution item")
    List<Institution> findAllOptimized();
}
