package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.AnimalSpecie;
import ma.sir.obs.dao.criteria.core.AnimalSpecieCriteria;
import ma.sir.obs.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface AnimalSpecieAdminService extends  IService<AnimalSpecie,AnimalSpecieCriteria, AnimalSpecieHistoryCriteria>  {




}
