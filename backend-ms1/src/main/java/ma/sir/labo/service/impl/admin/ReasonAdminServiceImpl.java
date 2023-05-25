package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Reason;
import ma.sir.labo.bean.history.ReasonHistory;
import ma.sir.labo.dao.criteria.core.ReasonCriteria;
import ma.sir.labo.dao.criteria.history.ReasonHistoryCriteria;
import ma.sir.labo.dao.facade.core.ReasonDao;
import ma.sir.labo.dao.facade.history.ReasonHistoryDao;
import ma.sir.labo.dao.specification.core.ReasonSpecification;
import ma.sir.labo.service.facade.admin.ReasonAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ReasonAdminServiceImpl extends AbstractServiceImpl<Reason,ReasonHistory, ReasonCriteria, ReasonHistoryCriteria, ReasonDao,
ReasonHistoryDao> implements ReasonAdminService {


    public Reason findByReferenceEntity(Reason t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Reason.class,ReasonHistory.class, ReasonHistoryCriteria.class, ReasonSpecification.class);
    }


    public ReasonAdminServiceImpl(ReasonDao dao, ReasonHistoryDao historyDao) {
        super(dao, historyDao);
    }

}