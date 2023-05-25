package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Brand;
import ma.sir.labo.bean.history.BrandHistory;
import ma.sir.labo.dao.criteria.core.BrandCriteria;
import ma.sir.labo.dao.criteria.history.BrandHistoryCriteria;
import ma.sir.labo.dao.facade.core.BrandDao;
import ma.sir.labo.dao.facade.history.BrandHistoryDao;
import ma.sir.labo.dao.specification.core.BrandSpecification;
import ma.sir.labo.service.facade.admin.BrandAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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