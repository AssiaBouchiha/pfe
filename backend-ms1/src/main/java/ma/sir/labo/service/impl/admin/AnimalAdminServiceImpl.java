package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Animal;
import ma.sir.labo.bean.history.AnimalHistory;
import ma.sir.labo.dao.criteria.core.AnimalCriteria;
import ma.sir.labo.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.labo.dao.facade.core.AnimalDao;
import ma.sir.labo.dao.facade.history.AnimalHistoryDao;
import ma.sir.labo.dao.specification.core.AnimalSpecification;
import ma.sir.labo.service.facade.admin.AnimalAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.AnimalTypeAdminService ;
import ma.sir.labo.service.facade.admin.AgeCategoryAdminService ;
import ma.sir.labo.service.facade.admin.MarketCategoryAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.GenderAdminService ;
import ma.sir.labo.service.facade.admin.AnimalSpecieAdminService ;


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
    public List<Animal> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Animal.class,AnimalHistory.class, AnimalHistoryCriteria.class, AnimalSpecification.class);
    }

    @Autowired
    private AnimalTypeAdminService animalTypeService ;
    @Autowired
    private AgeCategoryAdminService ageCategoryService ;
    @Autowired
    private MarketCategoryAdminService marketCategoryService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private GenderAdminService genderService ;
    @Autowired
    private AnimalSpecieAdminService animalSpecieService ;

    public AnimalAdminServiceImpl(AnimalDao dao, AnimalHistoryDao historyDao) {
        super(dao, historyDao);
    }

}