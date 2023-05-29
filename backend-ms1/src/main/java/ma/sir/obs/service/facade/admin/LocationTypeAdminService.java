package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.LocationType;
import ma.sir.obs.dao.criteria.core.LocationTypeCriteria;
import ma.sir.obs.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface LocationTypeAdminService extends  IService<LocationType,LocationTypeCriteria, LocationTypeHistoryCriteria>  {




}
