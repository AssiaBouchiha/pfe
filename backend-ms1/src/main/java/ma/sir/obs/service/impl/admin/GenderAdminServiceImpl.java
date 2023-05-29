package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Gender;
import ma.sir.obs.bean.history.GenderHistory;
import ma.sir.obs.dao.criteria.core.GenderCriteria;
import ma.sir.obs.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.obs.dao.facade.core.GenderDao;
import ma.sir.obs.dao.facade.history.GenderHistoryDao;
import ma.sir.obs.dao.specification.core.GenderSpecification;
import ma.sir.obs.service.facade.admin.GenderAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class GenderAdminServiceImpl extends AbstractServiceImpl<Gender,GenderHistory, GenderCriteria, GenderHistoryCriteria, GenderDao,
GenderHistoryDao> implements GenderAdminService {



    public Gender findByReferenceEntity(Gender t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Gender.class,GenderHistory.class, GenderHistoryCriteria.class, GenderSpecification.class);
    }


    public GenderAdminServiceImpl(GenderDao dao, GenderHistoryDao historyDao) {
        super(dao, historyDao);
    }

}