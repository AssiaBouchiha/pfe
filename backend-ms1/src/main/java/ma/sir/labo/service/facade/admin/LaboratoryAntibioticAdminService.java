package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.LaboratoryAntibiotic;
import ma.sir.labo.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.labo.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface LaboratoryAntibioticAdminService extends  IService<LaboratoryAntibiotic,LaboratoryAntibioticCriteria, LaboratoryAntibioticHistoryCriteria>  {

    List<LaboratoryAntibiotic> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);
    List<LaboratoryAntibiotic> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);



}
