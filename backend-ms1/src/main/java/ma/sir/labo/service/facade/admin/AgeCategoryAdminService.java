package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.AgeCategory;
import ma.sir.labo.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.labo.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AgeCategoryAdminService extends  IService<AgeCategory,AgeCategoryCriteria, AgeCategoryHistoryCriteria>  {




}
