package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.MarketCategory;
import ma.sir.obs.bean.history.MarketCategoryHistory;
import ma.sir.obs.dao.criteria.core.MarketCategoryCriteria;
import ma.sir.obs.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.obs.dao.facade.core.MarketCategoryDao;
import ma.sir.obs.dao.facade.history.MarketCategoryHistoryDao;
import ma.sir.obs.dao.specification.core.MarketCategorySpecification;
import ma.sir.obs.service.facade.admin.MarketCategoryAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class MarketCategoryAdminServiceImpl extends AbstractServiceImpl<MarketCategory,MarketCategoryHistory, MarketCategoryCriteria, MarketCategoryHistoryCriteria, MarketCategoryDao,
MarketCategoryHistoryDao> implements MarketCategoryAdminService {



    public MarketCategory findByReferenceEntity(MarketCategory t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(MarketCategory.class,MarketCategoryHistory.class, MarketCategoryHistoryCriteria.class, MarketCategorySpecification.class);
    }


    public MarketCategoryAdminServiceImpl(MarketCategoryDao dao, MarketCategoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}