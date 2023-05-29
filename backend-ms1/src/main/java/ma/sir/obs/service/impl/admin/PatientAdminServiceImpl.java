package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Patient;
import ma.sir.obs.bean.history.PatientHistory;
import ma.sir.obs.dao.criteria.core.PatientCriteria;
import ma.sir.obs.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.obs.dao.facade.core.PatientDao;
import ma.sir.obs.dao.facade.history.PatientHistoryDao;
import ma.sir.obs.dao.specification.core.PatientSpecification;
import ma.sir.obs.service.facade.admin.PatientAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.GenderAdminService ;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService ;


import java.util.List;
@Service
public class PatientAdminServiceImpl extends AbstractServiceImpl<Patient,PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientDao,
PatientHistoryDao> implements PatientAdminService {



    public Patient findByReferenceEntity(Patient t){
        return  dao.findByCode(t.getCode());
    }

    public List<Patient> findByGenderId(Long id){
        return dao.findByGenderId(id);
    }
    public int deleteByGenderId(Long id){
        return dao.deleteByGenderId(id);
    }
    public List<Patient> findByAgeCategoryId(Long id){
        return dao.findByAgeCategoryId(id);
    }
    public int deleteByAgeCategoryId(Long id){
        return dao.deleteByAgeCategoryId(id);
    }




    public void configure() {
        super.configure(Patient.class,PatientHistory.class, PatientHistoryCriteria.class, PatientSpecification.class);
    }

    @Autowired
    private GenderAdminService genderService ;
    @Autowired
    private AgeCategoryAdminService ageCategoryService ;

    public PatientAdminServiceImpl(PatientDao dao, PatientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}