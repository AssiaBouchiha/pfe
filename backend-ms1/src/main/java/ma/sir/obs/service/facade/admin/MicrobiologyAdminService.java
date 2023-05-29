package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Microbiology;
import ma.sir.obs.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.obs.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface MicrobiologyAdminService extends  IService<Microbiology,MicrobiologyCriteria, MicrobiologyHistoryCriteria>  {

    List<Microbiology> findByOrganismId(Long id);
    int deleteByOrganismId(Long id);
    List<Microbiology> findBySeroTypeId(Long id);
    int deleteBySeroTypeId(Long id);
    List<Microbiology> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);



}
