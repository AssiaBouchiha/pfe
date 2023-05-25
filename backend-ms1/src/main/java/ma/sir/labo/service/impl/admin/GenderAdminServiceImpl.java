package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Gender;
import ma.sir.labo.bean.history.GenderHistory;
import ma.sir.labo.dao.criteria.core.GenderCriteria;
import ma.sir.labo.dao.criteria.history.GenderHistoryCriteria;
import ma.sir.labo.dao.facade.core.GenderDao;
import ma.sir.labo.dao.facade.history.GenderHistoryDao;
import ma.sir.labo.dao.specification.core.GenderSpecification;
import ma.sir.labo.service.facade.admin.GenderAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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