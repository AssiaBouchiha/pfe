package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.AnimalType;
import ma.sir.obs.bean.history.AnimalTypeHistory;
import ma.sir.obs.dao.criteria.core.AnimalTypeCriteria;
import ma.sir.obs.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.obs.dao.facade.core.AnimalTypeDao;
import ma.sir.obs.dao.facade.history.AnimalTypeHistoryDao;
import ma.sir.obs.dao.specification.core.AnimalTypeSpecification;
import ma.sir.obs.service.facade.admin.AnimalTypeAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AnimalTypeAdminServiceImpl extends AbstractServiceImpl<AnimalType,AnimalTypeHistory, AnimalTypeCriteria, AnimalTypeHistoryCriteria, AnimalTypeDao,
AnimalTypeHistoryDao> implements AnimalTypeAdminService {



    public AnimalType findByReferenceEntity(AnimalType t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(AnimalType.class,AnimalTypeHistory.class, AnimalTypeHistoryCriteria.class, AnimalTypeSpecification.class);
    }


    public AnimalTypeAdminServiceImpl(AnimalTypeDao dao, AnimalTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}