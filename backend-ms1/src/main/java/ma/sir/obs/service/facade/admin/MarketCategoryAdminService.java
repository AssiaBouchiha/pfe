package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.MarketCategory;
import ma.sir.obs.dao.criteria.core.MarketCategoryCriteria;
import ma.sir.obs.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface MarketCategoryAdminService extends  IService<MarketCategory,MarketCategoryCriteria, MarketCategoryHistoryCriteria>  {




}
