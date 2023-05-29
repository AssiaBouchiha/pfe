package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Reason;
import ma.sir.obs.bean.history.ReasonHistory;
import ma.sir.obs.dao.criteria.core.ReasonCriteria;
import ma.sir.obs.dao.criteria.history.ReasonHistoryCriteria;
import ma.sir.obs.dao.facade.core.ReasonDao;
import ma.sir.obs.dao.facade.history.ReasonHistoryDao;
import ma.sir.obs.dao.specification.core.ReasonSpecification;
import ma.sir.obs.service.facade.admin.ReasonAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
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