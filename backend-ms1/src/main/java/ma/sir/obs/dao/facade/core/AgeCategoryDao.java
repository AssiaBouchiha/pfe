package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.AgeCategory;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.AgeCategory;
import java.util.List;


@Repository
public interface AgeCategoryDao extends AbstractRepository<AgeCategory,Long>  {
    AgeCategory findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW AgeCategory(item.id,item.libelle) FROM AgeCategory item")
    List<AgeCategory> findAllOptimized();
}
