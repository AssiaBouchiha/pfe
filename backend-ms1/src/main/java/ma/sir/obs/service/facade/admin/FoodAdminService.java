package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Food;
import ma.sir.obs.dao.criteria.core.FoodCriteria;
import ma.sir.obs.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface FoodAdminService extends  IService<Food,FoodCriteria, FoodHistoryCriteria>  {

    List<Food> findByAnimalSpecieId(Long id);
    int deleteByAnimalSpecieId(Long id);
    List<Food> findByMarketCategoryId(Long id);
    int deleteByMarketCategoryId(Long id);
    List<Food> findByBrandId(Long id);
    int deleteByBrandId(Long id);



}
