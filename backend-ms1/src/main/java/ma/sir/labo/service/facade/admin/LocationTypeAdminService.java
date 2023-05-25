package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.LocationType;
import ma.sir.labo.dao.criteria.core.LocationTypeCriteria;
import ma.sir.labo.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface LocationTypeAdminService extends  IService<LocationType,LocationTypeCriteria, LocationTypeHistoryCriteria>  {




}
