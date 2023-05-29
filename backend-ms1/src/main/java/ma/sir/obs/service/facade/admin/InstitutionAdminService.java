package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Institution;
import ma.sir.obs.dao.criteria.core.InstitutionCriteria;
import ma.sir.obs.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface InstitutionAdminService extends  IService<Institution,InstitutionCriteria, InstitutionHistoryCriteria>  {




}
