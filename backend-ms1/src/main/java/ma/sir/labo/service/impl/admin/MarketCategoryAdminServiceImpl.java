package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.MarketCategory;
import ma.sir.labo.bean.history.MarketCategoryHistory;
import ma.sir.labo.dao.criteria.core.MarketCategoryCriteria;
import ma.sir.labo.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.labo.dao.facade.core.MarketCategoryDao;
import ma.sir.labo.dao.facade.history.MarketCategoryHistoryDao;
import ma.sir.labo.dao.specification.core.MarketCategorySpecification;
import ma.sir.labo.service.facade.admin.MarketCategoryAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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