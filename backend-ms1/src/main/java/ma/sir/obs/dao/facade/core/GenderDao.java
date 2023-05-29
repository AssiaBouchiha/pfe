package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Gender;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Gender;
import java.util.List;


@Repository
public interface GenderDao extends AbstractRepository<Gender,Long>  {
    Gender findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Gender(item.id,item.libelle) FROM Gender item")
    List<Gender> findAllOptimized();
}
