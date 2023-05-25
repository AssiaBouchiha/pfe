package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Patient;
import ma.sir.labo.dao.criteria.core.PatientCriteria;
import ma.sir.labo.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface PatientAdminService extends  IService<Patient,PatientCriteria, PatientHistoryCriteria>  {

    List<Patient> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Patient> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Patient> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
