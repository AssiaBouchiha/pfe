package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Food;
import ma.sir.obs.bean.history.FoodHistory;
import ma.sir.obs.dao.criteria.core.FoodCriteria;
import ma.sir.obs.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.obs.dao.facade.core.FoodDao;
import ma.sir.obs.dao.facade.history.FoodHistoryDao;
import ma.sir.obs.dao.specification.core.FoodSpecification;
import ma.sir.obs.service.facade.admin.FoodAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.BrandAdminService ;
import ma.sir.obs.service.facade.admin.MarketCategoryAdminService ;
import ma.sir.obs.service.facade.admin.AnimalSpecieAdminService ;


import java.util.List;
@Service
public class FoodAdminServiceImpl extends AbstractServiceImpl<Food,FoodHistory, FoodCriteria, FoodHistoryCriteria, FoodDao,
FoodHistoryDao> implements FoodAdminService {



    public Food findByReferenceEntity(Food t){
        return  dao.findByCode(t.getCode());
    }

    public List<Food> findByAnimalSpecieId(Long id){
        return dao.findByAnimalSpecieId(id);
    }
    public int deleteByAnimalSpecieId(Long id){
        return dao.deleteByAnimalSpecieId(id);
    }
    public List<Food> findByMarketCategoryId(Long id){
        return dao.findByMarketCategoryId(id);
    }
    public int deleteByMarketCategoryId(Long id){
        return dao.deleteByMarketCategoryId(id);
    }
    public List<Food> findByBrandId(Long id){
        return dao.findByBrandId(id);
    }
    public int deleteByBrandId(Long id){
        return dao.deleteByBrandId(id);
    }




    public void configure() {
        super.configure(Food.class,FoodHistory.class, FoodHistoryCriteria.class, FoodSpecification.class);
    }

    @Autowired
    private BrandAdminService brandService ;
    @Autowired
    private MarketCategoryAdminService marketCategoryService ;
    @Autowired
    private AnimalSpecieAdminService animalSpecieService ;

    public FoodAdminServiceImpl(FoodDao dao, FoodHistoryDao historyDao) {
        super(dao, historyDao);
    }

}