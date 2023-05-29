package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.LocationData;
import ma.sir.obs.dao.criteria.core.LocationDataCriteria;
import ma.sir.obs.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface LocationDataAdminService extends  IService<LocationData,LocationDataCriteria, LocationDataHistoryCriteria>  {

    List<LocationData> findByInstitutionId(Long id);
    int deleteByInstitutionId(Long id);
    List<LocationData> findByDepartmentId(Long id);
    int deleteByDepartmentId(Long id);
    List<LocationData> findByLocationTypeId(Long id);
    int deleteByLocationTypeId(Long id);



}
