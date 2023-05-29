package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Environment;
import ma.sir.obs.dao.criteria.core.EnvironmentCriteria;
import ma.sir.obs.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface EnvironmentAdminService extends  IService<Environment,EnvironmentCriteria, EnvironmentHistoryCriteria>  {

    List<Environment> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Environment> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);



}
