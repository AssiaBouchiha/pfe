package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Food;
import ma.sir.labo.dao.criteria.core.FoodCriteria;
import ma.sir.labo.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface FoodAdminService extends  IService<Food,FoodCriteria, FoodHistoryCriteria>  {

    List<Food> findByAnimalSpecieId(Long id);
    int deleteByAnimalSpecieId(Long id);
    List<Food> findByMarketCategoryId(Long id);
    int deleteByMarketCategoryId(Long id);
    List<Food> findByBrandId(Long id);
    int deleteByBrandId(Long id);
    List<Food> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
