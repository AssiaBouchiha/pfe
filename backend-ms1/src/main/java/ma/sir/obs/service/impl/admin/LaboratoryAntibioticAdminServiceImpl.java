package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.LaboratoryAntibiotic;
import ma.sir.obs.bean.history.LaboratoryAntibioticHistory;
import ma.sir.obs.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.obs.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.obs.dao.facade.core.LaboratoryAntibioticDao;
import ma.sir.obs.dao.facade.history.LaboratoryAntibioticHistoryDao;
import ma.sir.obs.dao.specification.core.LaboratoryAntibioticSpecification;
import ma.sir.obs.service.facade.admin.LaboratoryAntibioticAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.LaboratoryAdminService ;
import ma.sir.obs.service.facade.admin.AntibioticAdminService ;


import java.util.List;
@Service
public class LaboratoryAntibioticAdminServiceImpl extends AbstractServiceImpl<LaboratoryAntibiotic,LaboratoryAntibioticHistory, LaboratoryAntibioticCriteria, LaboratoryAntibioticHistoryCriteria, LaboratoryAntibioticDao,
LaboratoryAntibioticHistoryDao> implements LaboratoryAntibioticAdminService {




    public List<LaboratoryAntibiotic> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }
    public List<LaboratoryAntibiotic> findByAntibioticId(Long id){
        return dao.findByAntibioticId(id);
    }
    public int deleteByAntibioticId(Long id){
        return dao.deleteByAntibioticId(id);
    }




    public void configure() {
        super.configure(LaboratoryAntibiotic.class,LaboratoryAntibioticHistory.class, LaboratoryAntibioticHistoryCriteria.class, LaboratoryAntibioticSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;
    @Autowired
    private AntibioticAdminService antibioticService ;

    public LaboratoryAntibioticAdminServiceImpl(LaboratoryAntibioticDao dao, LaboratoryAntibioticHistoryDao historyDao) {
        super(dao, historyDao);
    }

}