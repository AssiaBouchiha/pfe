package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.AnimalType;
import ma.sir.obs.dao.criteria.core.AnimalTypeCriteria;
import ma.sir.obs.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface AnimalTypeAdminService extends  IService<AnimalType,AnimalTypeCriteria, AnimalTypeHistoryCriteria>  {




}
