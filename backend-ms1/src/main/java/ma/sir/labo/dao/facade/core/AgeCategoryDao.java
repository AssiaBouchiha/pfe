package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.AgeCategory;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.AgeCategory;
import java.util.List;


@Repository
public interface AgeCategoryDao extends AbstractRepository<AgeCategory,Long>  {
    AgeCategory findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW AgeCategory(item.id,item.libelle) FROM AgeCategory item")
    List<AgeCategory> findAllOptimized();
}
