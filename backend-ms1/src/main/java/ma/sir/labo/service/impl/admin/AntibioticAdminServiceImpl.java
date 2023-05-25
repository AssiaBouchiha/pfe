package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Antibiotic;
import ma.sir.labo.bean.history.AntibioticHistory;
import ma.sir.labo.dao.criteria.core.AntibioticCriteria;
import ma.sir.labo.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.labo.dao.facade.core.AntibioticDao;
import ma.sir.labo.dao.facade.history.AntibioticHistoryDao;
import ma.sir.labo.dao.specification.core.AntibioticSpecification;
import ma.sir.labo.service.facade.admin.AntibioticAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.labo.bean.core.LaboratoryAntibiotic;

import ma.sir.labo.service.facade.admin.MicrobiologyAdminService ;
import ma.sir.labo.service.facade.admin.LaboratoryAntibioticAdminService ;


import java.util.List;
@Service
public class AntibioticAdminServiceImpl extends AbstractServiceImpl<Antibiotic,AntibioticHistory, AntibioticCriteria, AntibioticHistoryCriteria, AntibioticDao,
AntibioticHistoryDao> implements AntibioticAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Antibiotic create(Antibiotic t) {
        super.create(t);
        if (t.getLaboratoryAntibiotics() != null) {
                t.getLaboratoryAntibiotics().forEach(element-> {
                    element.setAntibiotic(t);
                    laboratoryAntibioticService.create(element);
            });
        }
        return t;
    }

    public Antibiotic findWithAssociatedLists(Long id){
        Antibiotic result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setLaboratoryAntibiotics(laboratoryAntibioticService.findByAntibioticId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        laboratoryAntibioticService.deleteByAntibioticId(id);
    }


    public void updateWithAssociatedLists(Antibiotic antibiotic){
    if(antibiotic !=null && antibiotic.getId() != null){
            List<List<LaboratoryAntibiotic>> resultLaboratoryAntibiotics= laboratoryAntibioticService.getToBeSavedAndToBeDeleted(laboratoryAntibioticService.findByAntibioticId(antibiotic.getId()),antibiotic.getLaboratoryAntibiotics());
            laboratoryAntibioticService.delete(resultLaboratoryAntibiotics.get(1));
            ListUtil.emptyIfNull(resultLaboratoryAntibiotics.get(0)).forEach(e -> e.setAntibiotic(antibiotic));
            laboratoryAntibioticService.update(resultLaboratoryAntibiotics.get(0),true);
    }
    }

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
    @Autowired
    private LaboratoryAntibioticAdminService laboratoryAntibioticService ;

    public AntibioticAdminServiceImpl(AntibioticDao dao, AntibioticHistoryDao historyDao) {
        super(dao, historyDao);
    }

}