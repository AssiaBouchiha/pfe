package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Organism;
import ma.sir.obs.dao.criteria.core.OrganismCriteria;
import ma.sir.obs.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface OrganismAdminService extends  IService<Organism,OrganismCriteria, OrganismHistoryCriteria>  {




}
