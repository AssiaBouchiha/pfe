package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Institution;
import ma.sir.labo.bean.history.InstitutionHistory;
import ma.sir.labo.dao.criteria.core.InstitutionCriteria;
import ma.sir.labo.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.labo.dao.facade.core.InstitutionDao;
import ma.sir.labo.dao.facade.history.InstitutionHistoryDao;
import ma.sir.labo.dao.specification.core.InstitutionSpecification;
import ma.sir.labo.service.facade.admin.InstitutionAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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