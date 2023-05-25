package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Environment;
import ma.sir.labo.dao.criteria.core.EnvironmentCriteria;
import ma.sir.labo.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface EnvironmentAdminService extends  IService<Environment,EnvironmentCriteria, EnvironmentHistoryCriteria>  {

    List<Environment> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Environment> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Environment> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
