package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Plant;
import ma.sir.labo.dao.criteria.core.PlantCriteria;
import ma.sir.labo.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface PlantAdminService extends  IService<Plant,PlantCriteria, PlantHistoryCriteria>  {

    List<Plant> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Plant> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Plant> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
