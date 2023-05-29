package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Location;
import ma.sir.obs.bean.history.LocationHistory;
import ma.sir.obs.dao.criteria.core.LocationCriteria;
import ma.sir.obs.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.obs.dao.facade.core.LocationDao;
import ma.sir.obs.dao.facade.history.LocationHistoryDao;
import ma.sir.obs.dao.specification.core.LocationSpecification;
import ma.sir.obs.service.facade.admin.LocationAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.LaboratoryAdminService ;
import ma.sir.obs.service.facade.admin.InstitutionAdminService ;
import ma.sir.obs.service.facade.admin.LocationTypeAdminService ;
import ma.sir.obs.service.facade.admin.DepartmentAdminService ;


import java.util.List;
@Service
public class LocationAdminServiceImpl extends AbstractServiceImpl<Location,LocationHistory, LocationCriteria, LocationHistoryCriteria, LocationDao,
LocationHistoryDao> implements LocationAdminService {



    public Location findByReferenceEntity(Location t){
        return  dao.findByCode(t.getCode());
    }

    public List<Location> findByInstitutionId(Long id){
        return dao.findByInstitutionId(id);
    }
    public int deleteByInstitutionId(Long id){
        return dao.deleteByInstitutionId(id);
    }
    public List<Location> findByDepartmentId(Long id){
        return dao.findByDepartmentId(id);
    }
    public int deleteByDepartmentId(Long id){
        return dao.deleteByDepartmentId(id);
    }
    public List<Location> findByLocationTypeId(Long id){
        return dao.findByLocationTypeId(id);
    }
    public int deleteByLocationTypeId(Long id){
        return dao.deleteByLocationTypeId(id);
    }
    public List<Location> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }




    public void configure() {
        super.configure(Location.class,LocationHistory.class, LocationHistoryCriteria.class, LocationSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;
    @Autowired
    private InstitutionAdminService institutionService ;
    @Autowired
    private LocationTypeAdminService locationTypeService ;
    @Autowired
    private DepartmentAdminService departmentService ;

    public LocationAdminServiceImpl(LocationDao dao, LocationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}