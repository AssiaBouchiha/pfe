package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Gender;
import ma.sir.obs.dao.criteria.core.GenderCriteria;
import ma.sir.obs.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface GenderAdminService extends  IService<Gender,GenderCriteria, GenderHistoryCriteria>  {




}
