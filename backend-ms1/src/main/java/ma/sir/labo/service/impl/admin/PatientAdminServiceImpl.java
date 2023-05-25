package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Patient;
import ma.sir.labo.bean.history.PatientHistory;
import ma.sir.labo.dao.criteria.core.PatientCriteria;
import ma.sir.labo.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.labo.dao.facade.core.PatientDao;
import ma.sir.labo.dao.facade.history.PatientHistoryDao;
import ma.sir.labo.dao.specification.core.PatientSpecification;
import ma.sir.labo.service.facade.admin.PatientAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.AgeCategoryAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.GenderAdminService ;


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
    public List<Patient> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Patient.class,PatientHistory.class, PatientHistoryCriteria.class, PatientSpecification.class);
    }

    @Autowired
    private AgeCategoryAdminService ageCategoryService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private GenderAdminService genderService ;

    public PatientAdminServiceImpl(PatientDao dao, PatientHistoryDao historyDao) {
        super(dao, historyDao);
    }

}