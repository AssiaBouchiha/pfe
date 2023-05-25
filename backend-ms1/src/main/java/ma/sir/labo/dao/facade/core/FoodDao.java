package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Food;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Food;
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
    List<Food> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);

    @Query("SELECT NEW Food(item.id,item.code) FROM Food item")
    List<Food> findAllOptimized();
}
