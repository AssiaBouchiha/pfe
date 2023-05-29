package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.AnimalSpecie;
import ma.sir.obs.bean.history.AnimalSpecieHistory;
import ma.sir.obs.dao.criteria.core.AnimalSpecieCriteria;
import ma.sir.obs.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.obs.dao.facade.core.AnimalSpecieDao;
import ma.sir.obs.dao.facade.history.AnimalSpecieHistoryDao;
import ma.sir.obs.dao.specification.core.AnimalSpecieSpecification;
import ma.sir.obs.service.facade.admin.AnimalSpecieAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AnimalSpecieAdminServiceImpl extends AbstractServiceImpl<AnimalSpecie,AnimalSpecieHistory, AnimalSpecieCriteria, AnimalSpecieHistoryCriteria, AnimalSpecieDao,
AnimalSpecieHistoryDao> implements AnimalSpecieAdminService {



    public AnimalSpecie findByReferenceEntity(AnimalSpecie t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(AnimalSpecie.class,AnimalSpecieHistory.class, AnimalSpecieHistoryCriteria.class, AnimalSpecieSpecification.class);
    }


    public AnimalSpecieAdminServiceImpl(AnimalSpecieDao dao, AnimalSpecieHistoryDao historyDao) {
        super(dao, historyDao);
    }

}