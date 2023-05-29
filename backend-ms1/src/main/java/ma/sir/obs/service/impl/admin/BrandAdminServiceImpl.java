package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Brand;
import ma.sir.obs.bean.history.BrandHistory;
import ma.sir.obs.dao.criteria.core.BrandCriteria;
import ma.sir.obs.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.obs.dao.facade.core.BrandDao;
import ma.sir.obs.dao.facade.history.BrandHistoryDao;
import ma.sir.obs.dao.specification.core.BrandSpecification;
import ma.sir.obs.service.facade.admin.BrandAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class BrandAdminServiceImpl extends AbstractServiceImpl<Brand,BrandHistory, BrandCriteria, BrandHistoryCriteria, BrandDao,
BrandHistoryDao> implements BrandAdminService {



    public Brand findByReferenceEntity(Brand t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Brand.class,BrandHistory.class, BrandHistoryCriteria.class, BrandSpecification.class);
    }


    public BrandAdminServiceImpl(BrandDao dao, BrandHistoryDao historyDao) {
        super(dao, historyDao);
    }

}