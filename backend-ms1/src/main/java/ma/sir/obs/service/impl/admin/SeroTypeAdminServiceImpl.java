package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.SeroType;
import ma.sir.obs.bean.history.SeroTypeHistory;
import ma.sir.obs.dao.criteria.core.SeroTypeCriteria;
import ma.sir.obs.dao.criteria.history.SeroTypeHistoryCriteria;
import ma.sir.obs.dao.facade.core.SeroTypeDao;
import ma.sir.obs.dao.facade.history.SeroTypeHistoryDao;
import ma.sir.obs.dao.specification.core.SeroTypeSpecification;
import ma.sir.obs.service.facade.admin.SeroTypeAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SeroTypeAdminServiceImpl extends AbstractServiceImpl<SeroType,SeroTypeHistory, SeroTypeCriteria, SeroTypeHistoryCriteria, SeroTypeDao,
SeroTypeHistoryDao> implements SeroTypeAdminService {



    public SeroType findByReferenceEntity(SeroType t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(SeroType.class,SeroTypeHistory.class, SeroTypeHistoryCriteria.class, SeroTypeSpecification.class);
    }


    public SeroTypeAdminServiceImpl(SeroTypeDao dao, SeroTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}