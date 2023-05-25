package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.AnimalSpecie;
import ma.sir.labo.bean.history.AnimalSpecieHistory;
import ma.sir.labo.dao.criteria.core.AnimalSpecieCriteria;
import ma.sir.labo.dao.criteria.history.AnimalSpecieHistoryCriteria;
import ma.sir.labo.dao.facade.core.AnimalSpecieDao;
import ma.sir.labo.dao.facade.history.AnimalSpecieHistoryDao;
import ma.sir.labo.dao.specification.core.AnimalSpecieSpecification;
import ma.sir.labo.service.facade.admin.AnimalSpecieAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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