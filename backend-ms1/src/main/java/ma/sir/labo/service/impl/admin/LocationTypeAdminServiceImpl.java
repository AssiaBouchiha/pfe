package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.LocationType;
import ma.sir.labo.bean.history.LocationTypeHistory;
import ma.sir.labo.dao.criteria.core.LocationTypeCriteria;
import ma.sir.labo.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.labo.dao.facade.core.LocationTypeDao;
import ma.sir.labo.dao.facade.history.LocationTypeHistoryDao;
import ma.sir.labo.dao.specification.core.LocationTypeSpecification;
import ma.sir.labo.service.facade.admin.LocationTypeAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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