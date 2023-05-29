package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.LaboratoryAntibiotic;
import ma.sir.obs.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.obs.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface LaboratoryAntibioticAdminService extends  IService<LaboratoryAntibiotic,LaboratoryAntibioticCriteria, LaboratoryAntibioticHistoryCriteria>  {

    List<LaboratoryAntibiotic> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);
    List<LaboratoryAntibiotic> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);



}
