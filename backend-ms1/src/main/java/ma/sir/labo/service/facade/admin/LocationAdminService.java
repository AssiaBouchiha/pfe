package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Location;
import ma.sir.labo.dao.criteria.core.LocationCriteria;
import ma.sir.labo.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


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
