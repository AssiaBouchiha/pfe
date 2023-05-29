package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Institution;
import ma.sir.obs.bean.history.InstitutionHistory;
import ma.sir.obs.dao.criteria.core.InstitutionCriteria;
import ma.sir.obs.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.obs.dao.facade.core.InstitutionDao;
import ma.sir.obs.dao.facade.history.InstitutionHistoryDao;
import ma.sir.obs.dao.specification.core.InstitutionSpecification;
import ma.sir.obs.service.facade.admin.InstitutionAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class InstitutionAdminServiceImpl extends AbstractServiceImpl<Institution,InstitutionHistory, InstitutionCriteria, InstitutionHistoryCriteria, InstitutionDao,
InstitutionHistoryDao> implements InstitutionAdminService {



    public Institution findByReferenceEntity(Institution t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Institution.class,InstitutionHistory.class, InstitutionHistoryCriteria.class, InstitutionSpecification.class);
    }


    public InstitutionAdminServiceImpl(InstitutionDao dao, InstitutionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}