package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Antibiotic;
import ma.sir.obs.dao.criteria.core.AntibioticCriteria;
import ma.sir.obs.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface AntibioticAdminService extends  IService<Antibiotic,AntibioticCriteria, AntibioticHistoryCriteria>  {

    List<Antibiotic> findByMicrobiologyId(Long id);
    int deleteByMicrobiologyId(Long id);



}
