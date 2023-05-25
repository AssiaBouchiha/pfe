package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.LocationData;
import ma.sir.labo.dao.criteria.core.LocationDataCriteria;
import ma.sir.labo.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface LocationDataAdminService extends  IService<LocationData,LocationDataCriteria, LocationDataHistoryCriteria>  {

    List<LocationData> findByInstitutionId(Long id);
    int deleteByInstitutionId(Long id);
    List<LocationData> findByDepartmentId(Long id);
    int deleteByDepartmentId(Long id);
    List<LocationData> findByLocationTypeId(Long id);
    int deleteByLocationTypeId(Long id);
    List<LocationData> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
