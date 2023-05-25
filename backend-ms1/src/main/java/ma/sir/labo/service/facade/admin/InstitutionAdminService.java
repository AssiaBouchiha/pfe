package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Institution;
import ma.sir.labo.dao.criteria.core.InstitutionCriteria;
import ma.sir.labo.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface InstitutionAdminService extends  IService<Institution,InstitutionCriteria, InstitutionHistoryCriteria>  {




}
