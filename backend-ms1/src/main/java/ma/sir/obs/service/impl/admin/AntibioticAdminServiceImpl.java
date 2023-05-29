package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Antibiotic;
import ma.sir.obs.bean.history.AntibioticHistory;
import ma.sir.obs.dao.criteria.core.AntibioticCriteria;
import ma.sir.obs.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.obs.dao.facade.core.AntibioticDao;
import ma.sir.obs.dao.facade.history.AntibioticHistoryDao;
import ma.sir.obs.dao.specification.core.AntibioticSpecification;
import ma.sir.obs.service.facade.admin.AntibioticAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.MicrobiologyAdminService ;


import java.util.List;
@Service
public class AntibioticAdminServiceImpl extends AbstractServiceImpl<Antibiotic,AntibioticHistory, AntibioticCriteria, AntibioticHistoryCriteria, AntibioticDao,
AntibioticHistoryDao> implements AntibioticAdminService {



    public Antibiotic findByReferenceEntity(Antibiotic t){
        return  dao.findByCode(t.getCode());
    }

    public List<Antibiotic> findByMicrobiologyId(Long id){
        return dao.findByMicrobiologyId(id);
    }
    public int deleteByMicrobiologyId(Long id){
        return dao.deleteByMicrobiologyId(id);
    }




    public void configure() {
        super.configure(Antibiotic.class,AntibioticHistory.class, AntibioticHistoryCriteria.class, AntibioticSpecification.class);
    }

    @Autowired
    private MicrobiologyAdminService microbiologyService ;

    public AntibioticAdminServiceImpl(AntibioticDao dao, AntibioticHistoryDao historyDao) {
        super(dao, historyDao);
    }

}