package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.MarketCategory;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.MarketCategory;
import java.util.List;


@Repository
public interface MarketCategoryDao extends AbstractRepository<MarketCategory,Long>  {
    MarketCategory findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW MarketCategory(item.id,item.libelle) FROM MarketCategory item")
    List<MarketCategory> findAllOptimized();
}
