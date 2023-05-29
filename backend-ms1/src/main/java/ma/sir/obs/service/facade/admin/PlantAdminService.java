package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Plant;
import ma.sir.obs.dao.criteria.core.PlantCriteria;
import ma.sir.obs.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface PlantAdminService extends  IService<Plant,PlantCriteria, PlantHistoryCriteria>  {

    List<Plant> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Plant> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);



}
