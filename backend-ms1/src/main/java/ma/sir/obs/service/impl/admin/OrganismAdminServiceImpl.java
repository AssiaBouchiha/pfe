package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Organism;
import ma.sir.obs.bean.history.OrganismHistory;
import ma.sir.obs.dao.criteria.core.OrganismCriteria;
import ma.sir.obs.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.obs.dao.facade.core.OrganismDao;
import ma.sir.obs.dao.facade.history.OrganismHistoryDao;
import ma.sir.obs.dao.specification.core.OrganismSpecification;
import ma.sir.obs.service.facade.admin.OrganismAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class OrganismAdminServiceImpl extends AbstractServiceImpl<Organism,OrganismHistory, OrganismCriteria, OrganismHistoryCriteria, OrganismDao,
OrganismHistoryDao> implements OrganismAdminService {



    public Organism findByReferenceEntity(Organism t){
        return  dao.findByCode(t.getCode());
    }





    public void configure() {
        super.configure(Organism.class,OrganismHistory.class, OrganismHistoryCriteria.class, OrganismSpecification.class);
    }


    public OrganismAdminServiceImpl(OrganismDao dao, OrganismHistoryDao historyDao) {
        super(dao, historyDao);
    }

}