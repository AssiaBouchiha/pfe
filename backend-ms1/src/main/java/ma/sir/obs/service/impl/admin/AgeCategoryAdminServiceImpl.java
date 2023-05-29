package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.AgeCategory;
import ma.sir.obs.bean.history.AgeCategoryHistory;
import ma.sir.obs.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.obs.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.obs.dao.facade.core.AgeCategoryDao;
import ma.sir.obs.dao.facade.history.AgeCategoryHistoryDao;
import ma.sir.obs.dao.specification.core.AgeCategorySpecification;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AgeCategoryAdminServiceImpl extends AbstractServiceImpl<AgeCategory,AgeCategoryHistory, AgeCategoryCriteria, AgeCategoryHistoryCriteria, AgeCategoryDao,
AgeCategoryHistoryDao> implements AgeCategoryAdminService {



    public AgeCategory findByReferenceEntity(AgeCategory t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(AgeCategory.class,AgeCategoryHistory.class, AgeCategoryHistoryCriteria.class, AgeCategorySpecification.class);
    }


    public AgeCategoryAdminServiceImpl(AgeCategoryDao dao, AgeCategoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}