package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.LocationData;
import ma.sir.obs.bean.history.LocationDataHistory;
import ma.sir.obs.dao.criteria.core.LocationDataCriteria;
import ma.sir.obs.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.obs.dao.facade.core.LocationDataDao;
import ma.sir.obs.dao.facade.history.LocationDataHistoryDao;
import ma.sir.obs.dao.specification.core.LocationDataSpecification;
import ma.sir.obs.service.facade.admin.LocationDataAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.InstitutionAdminService ;
import ma.sir.obs.service.facade.admin.LocationTypeAdminService ;
import ma.sir.obs.service.facade.admin.DepartmentAdminService ;


import java.util.List;
@Service
public class LocationDataAdminServiceImpl extends AbstractServiceImpl<LocationData,LocationDataHistory, LocationDataCriteria, LocationDataHistoryCriteria, LocationDataDao,
LocationDataHistoryDao> implements LocationDataAdminService {



    public LocationData findByReferenceEntity(LocationData t){
        return  dao.findByCode(t.getCode());
    }

    public List<LocationData> findByInstitutionId(Long id){
        return dao.findByInstitutionId(id);
    }
    public int deleteByInstitutionId(Long id){
        return dao.deleteByInstitutionId(id);
    }
    public List<LocationData> findByDepartmentId(Long id){
        return dao.findByDepartmentId(id);
    }
    public int deleteByDepartmentId(Long id){
        return dao.deleteByDepartmentId(id);
    }
    public List<LocationData> findByLocationTypeId(Long id){
        return dao.findByLocationTypeId(id);
    }
    public int deleteByLocationTypeId(Long id){
        return dao.deleteByLocationTypeId(id);
    }




    public void configure() {
        super.configure(LocationData.class,LocationDataHistory.class, LocationDataHistoryCriteria.class, LocationDataSpecification.class);
    }

    @Autowired
    private InstitutionAdminService institutionService ;
    @Autowired
    private LocationTypeAdminService locationTypeService ;
    @Autowired
    private DepartmentAdminService departmentService ;

    public LocationDataAdminServiceImpl(LocationDataDao dao, LocationDataHistoryDao historyDao) {
        super(dao, historyDao);
    }

}