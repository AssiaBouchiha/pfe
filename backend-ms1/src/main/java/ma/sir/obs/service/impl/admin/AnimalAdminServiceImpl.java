package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Animal;
import ma.sir.obs.bean.history.AnimalHistory;
import ma.sir.obs.dao.criteria.core.AnimalCriteria;
import ma.sir.obs.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.obs.dao.facade.core.AnimalDao;
import ma.sir.obs.dao.facade.history.AnimalHistoryDao;
import ma.sir.obs.dao.specification.core.AnimalSpecification;
import ma.sir.obs.service.facade.admin.AnimalAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.GenderAdminService ;
import ma.sir.obs.service.facade.admin.AnimalTypeAdminService ;
import ma.sir.obs.service.facade.admin.MarketCategoryAdminService ;
import ma.sir.obs.service.facade.admin.AnimalSpecieAdminService ;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService ;


import java.util.List;
@Service
public class AnimalAdminServiceImpl extends AbstractServiceImpl<Animal,AnimalHistory, AnimalCriteria, AnimalHistoryCriteria, AnimalDao,
AnimalHistoryDao> implements AnimalAdminService {



    public Animal findByReferenceEntity(Animal t){
        return  dao.findByCode(t.getCode());
    }

    public List<Animal> findByGenderId(Long id){
        return dao.findByGenderId(id);
    }
    public int deleteByGenderId(Long id){
        return dao.deleteByGenderId(id);
    }
    public List<Animal> findByAgeCategoryId(Long id){
        return dao.findByAgeCategoryId(id);
    }
    public int deleteByAgeCategoryId(Long id){
        return dao.deleteByAgeCategoryId(id);
    }
    public List<Animal> findByAnimalSpecieId(Long id){
        return dao.findByAnimalSpecieId(id);
    }
    public int deleteByAnimalSpecieId(Long id){
        return dao.deleteByAnimalSpecieId(id);
    }
    public List<Animal> findByAnimalTypeId(Long id){
        return dao.findByAnimalTypeId(id);
    }
    public int deleteByAnimalTypeId(Long id){
        return dao.deleteByAnimalTypeId(id);
    }
    public List<Animal> findByMarketCategoryId(Long id){
        return dao.findByMarketCategoryId(id);
    }
    public int deleteByMarketCategoryId(Long id){
        return dao.deleteByMarketCategoryId(id);
    }




    public void configure() {
        super.configure(Animal.class,AnimalHistory.class, AnimalHistoryCriteria.class, AnimalSpecification.class);
    }

    @Autowired
    private GenderAdminService genderService ;
    @Autowired
    private AnimalTypeAdminService animalTypeService ;
    @Autowired
    private MarketCategoryAdminService marketCategoryService ;
    @Autowired
    private AnimalSpecieAdminService animalSpecieService ;
    @Autowired
    private AgeCategoryAdminService ageCategoryService ;

    public AnimalAdminServiceImpl(AnimalDao dao, AnimalHistoryDao historyDao) {
        super(dao, historyDao);
    }

}