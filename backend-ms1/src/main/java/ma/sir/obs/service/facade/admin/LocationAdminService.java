package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Location;
import ma.sir.obs.dao.criteria.core.LocationCriteria;
import ma.sir.obs.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface LocationAdminService extends  IService<Location,LocationCriteria, LocationHistoryCriteria>  {

    List<Location> findByInstitutionId(Long id);
    int deleteByInstitutionId(Long id);
    List<Location> findByDepartmentId(Long id);
    int deleteByDepartmentId(Long id);
    List<Location> findByLocationTypeId(Long id);
    int deleteByLocationTypeId(Long id);
    List<Location> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
