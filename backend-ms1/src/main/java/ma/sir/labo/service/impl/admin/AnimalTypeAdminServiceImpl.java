package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.AnimalType;
import ma.sir.labo.bean.history.AnimalTypeHistory;
import ma.sir.labo.dao.criteria.core.AnimalTypeCriteria;
import ma.sir.labo.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.labo.dao.facade.core.AnimalTypeDao;
import ma.sir.labo.dao.facade.history.AnimalTypeHistoryDao;
import ma.sir.labo.dao.specification.core.AnimalTypeSpecification;
import ma.sir.labo.service.facade.admin.AnimalTypeAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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