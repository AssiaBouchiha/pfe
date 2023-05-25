package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Serotype;
import ma.sir.labo.bean.history.SerotypeHistory;
import ma.sir.labo.dao.criteria.core.SerotypeCriteria;
import ma.sir.labo.dao.criteria.history.SerotypeHistoryCriteria;
import ma.sir.labo.dao.facade.core.SerotypeDao;
import ma.sir.labo.dao.facade.history.SerotypeHistoryDao;
import ma.sir.labo.dao.specification.core.SerotypeSpecification;
import ma.sir.labo.service.facade.admin.SerotypeAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SerotypeAdminServiceImpl extends AbstractServiceImpl<Serotype,SerotypeHistory, SerotypeCriteria, SerotypeHistoryCriteria, SerotypeDao,
SerotypeHistoryDao> implements SerotypeAdminService {


    public Serotype findByReferenceEntity(Serotype t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Serotype.class,SerotypeHistory.class, SerotypeHistoryCriteria.class, SerotypeSpecification.class);
    }


    public SerotypeAdminServiceImpl(SerotypeDao dao, SerotypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}