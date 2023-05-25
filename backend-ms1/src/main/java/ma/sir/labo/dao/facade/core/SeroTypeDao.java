package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Serotype;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Serotype;
import java.util.List;


@Repository
public interface SerotypeDao extends AbstractRepository<Serotype,Long>  {
    Serotype findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Serotype(item.id,item.libelle) FROM Serotype item")
    List<Serotype> findAllOptimized();
}
