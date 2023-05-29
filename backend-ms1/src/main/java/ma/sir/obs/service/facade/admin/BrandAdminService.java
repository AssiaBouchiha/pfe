package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Brand;
import ma.sir.obs.dao.criteria.core.BrandCriteria;
import ma.sir.obs.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface BrandAdminService extends  IService<Brand,BrandCriteria, BrandHistoryCriteria>  {




}
