package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.AgeCategory;
import ma.sir.labo.bean.history.AgeCategoryHistory;
import ma.sir.labo.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.labo.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.labo.dao.facade.core.AgeCategoryDao;
import ma.sir.labo.dao.facade.history.AgeCategoryHistoryDao;
import ma.sir.labo.dao.specification.core.AgeCategorySpecification;
import ma.sir.labo.service.facade.admin.AgeCategoryAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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