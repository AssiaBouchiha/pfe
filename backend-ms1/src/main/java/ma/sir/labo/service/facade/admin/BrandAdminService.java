package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Brand;
import ma.sir.labo.dao.criteria.core.BrandCriteria;
import ma.sir.labo.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface BrandAdminService extends  IService<Brand,BrandCriteria, BrandHistoryCriteria>  {




}
