package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.LocationType;
import ma.sir.obs.bean.history.LocationTypeHistory;
import ma.sir.obs.dao.criteria.core.LocationTypeCriteria;
import ma.sir.obs.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.obs.dao.facade.core.LocationTypeDao;
import ma.sir.obs.dao.facade.history.LocationTypeHistoryDao;
import ma.sir.obs.dao.specification.core.LocationTypeSpecification;
import ma.sir.obs.service.facade.admin.LocationTypeAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class LocationTypeAdminServiceImpl extends AbstractServiceImpl<LocationType,LocationTypeHistory, LocationTypeCriteria, LocationTypeHistoryCriteria, LocationTypeDao,
LocationTypeHistoryDao> implements LocationTypeAdminService {



    public LocationType findByReferenceEntity(LocationType t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(LocationType.class,LocationTypeHistory.class, LocationTypeHistoryCriteria.class, LocationTypeSpecification.class);
    }


    public LocationTypeAdminServiceImpl(LocationTypeDao dao, LocationTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}