package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.AgeCategory;
import ma.sir.obs.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.obs.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface AgeCategoryAdminService extends  IService<AgeCategory,AgeCategoryCriteria, AgeCategoryHistoryCriteria>  {




}
