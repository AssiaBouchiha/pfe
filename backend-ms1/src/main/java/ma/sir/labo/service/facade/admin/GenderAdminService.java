package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Gender;
import ma.sir.labo.dao.criteria.core.GenderCriteria;
import ma.sir.labo.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface GenderAdminService extends  IService<Gender,GenderCriteria, GenderHistoryCriteria>  {




}
