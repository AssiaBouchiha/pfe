package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Organism;
import ma.sir.labo.bean.history.OrganismHistory;
import ma.sir.labo.dao.criteria.core.OrganismCriteria;
import ma.sir.labo.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.labo.dao.facade.core.OrganismDao;
import ma.sir.labo.dao.facade.history.OrganismHistoryDao;
import ma.sir.labo.dao.specification.core.OrganismSpecification;
import ma.sir.labo.service.facade.admin.OrganismAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
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