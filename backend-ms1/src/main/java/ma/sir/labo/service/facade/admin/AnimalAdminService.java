package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Animal;
import ma.sir.labo.dao.criteria.core.AnimalCriteria;
import ma.sir.labo.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AnimalAdminService extends  IService<Animal,AnimalCriteria, AnimalHistoryCriteria>  {

    List<Animal> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Animal> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Animal> findByAnimalSpecieId(Long id);
    int deleteByAnimalSpecieId(Long id);
    List<Animal> findByAnimalTypeId(Long id);
    int deleteByAnimalTypeId(Long id);
    List<Animal> findByMarketCategoryId(Long id);
    int deleteByMarketCategoryId(Long id);
    List<Animal> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
