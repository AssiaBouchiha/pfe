package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Antibiotic;
import ma.sir.labo.dao.criteria.core.AntibioticCriteria;
import ma.sir.labo.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AntibioticAdminService extends  IService<Antibiotic,AntibioticCriteria, AntibioticHistoryCriteria>  {

    List<Antibiotic> findByMicrobiologyId(Long id);
    int deleteByMicrobiologyId(Long id);



}
