package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Food;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Food;
import java.util.List;


@Repository
public interface FoodDao extends AbstractRepository<Food,Long>  {
    Food findByCode(String code);
    int deleteByCode(String code);

    List<Food> findByAnimalSpecieId(Long id);
    int deleteByAnimalSpecieId(Long id);
    List<Food> findByMarketCategoryId(Long id);
    int deleteByMarketCategoryId(Long id);
    List<Food> findByBrandId(Long id);
    int deleteByBrandId(Long id);

    @Query("SELECT NEW Food(item.id,item.code) FROM Food item")
    List<Food> findAllOptimized();
}
