package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.AnimalType;
import ma.sir.labo.dao.criteria.core.AnimalTypeCriteria;
import ma.sir.labo.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AnimalTypeAdminService extends  IService<AnimalType,AnimalTypeCriteria, AnimalTypeHistoryCriteria>  {




}
