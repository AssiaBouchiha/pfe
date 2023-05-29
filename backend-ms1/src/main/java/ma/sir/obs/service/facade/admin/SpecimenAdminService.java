package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Specimen;
import ma.sir.obs.dao.criteria.core.SpecimenCriteria;
import ma.sir.obs.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface SpecimenAdminService extends  IService<Specimen,SpecimenCriteria, SpecimenHistoryCriteria>  {

    List<Specimen> findByReasonId(Long id);
    int deleteByReasonId(Long id);



}
