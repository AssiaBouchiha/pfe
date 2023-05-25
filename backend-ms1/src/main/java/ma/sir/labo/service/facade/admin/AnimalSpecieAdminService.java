package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.AnimalSpecie;
import ma.sir.labo.dao.criteria.core.AnimalSpecieCriteria;
import ma.sir.labo.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AnimalSpecieAdminService extends  IService<AnimalSpecie,AnimalSpecieCriteria, AnimalSpecieHistoryCriteria>  {




}
