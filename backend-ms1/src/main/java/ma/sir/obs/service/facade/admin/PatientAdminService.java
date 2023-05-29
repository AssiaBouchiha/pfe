package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Patient;
import ma.sir.obs.dao.criteria.core.PatientCriteria;
import ma.sir.obs.dao.criteria.history.PatientHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface PatientAdminService extends  IService<Patient,PatientCriteria, PatientHistoryCriteria>  {

    List<Patient> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Patient> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);



}
