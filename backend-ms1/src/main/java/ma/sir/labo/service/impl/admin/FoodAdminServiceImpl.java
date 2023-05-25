package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Food;
import ma.sir.labo.bean.history.FoodHistory;
import ma.sir.labo.dao.criteria.core.FoodCriteria;
import ma.sir.labo.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.labo.dao.facade.core.FoodDao;
import ma.sir.labo.dao.facade.history.FoodHistoryDao;
import ma.sir.labo.dao.specification.core.FoodSpecification;
import ma.sir.labo.service.facade.admin.FoodAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.BrandAdminService ;
import ma.sir.labo.service.facade.admin.MarketCategoryAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.AnimalSpecieAdminService ;


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
    public List<Food> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Food.class,FoodHistory.class, FoodHistoryCriteria.class, FoodSpecification.class);
    }

    @Autowired
    private BrandAdminService brandService ;
    @Autowired
    private MarketCategoryAdminService marketCategoryService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private AnimalSpecieAdminService animalSpecieService ;

    public FoodAdminServiceImpl(FoodDao dao, FoodHistoryDao historyDao) {
        super(dao, historyDao);
    }

}