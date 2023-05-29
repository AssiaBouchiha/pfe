package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Animal;
import ma.sir.obs.dao.criteria.core.AnimalCriteria;
import ma.sir.obs.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


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



}
