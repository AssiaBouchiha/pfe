package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.LaboratoryAntibiotic;
import ma.sir.labo.bean.history.LaboratoryAntibioticHistory;
import ma.sir.labo.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.labo.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.labo.dao.facade.core.LaboratoryAntibioticDao;
import ma.sir.labo.dao.facade.history.LaboratoryAntibioticHistoryDao;
import ma.sir.labo.dao.specification.core.LaboratoryAntibioticSpecification;
import ma.sir.labo.service.facade.admin.LaboratoryAntibioticAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.LaboratoryAdminService ;
import ma.sir.labo.service.facade.admin.AntibioticAdminService ;


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