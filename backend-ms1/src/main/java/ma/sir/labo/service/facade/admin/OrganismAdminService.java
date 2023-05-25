package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Organism;
import ma.sir.labo.dao.criteria.core.OrganismCriteria;
import ma.sir.labo.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface OrganismAdminService extends  IService<Organism,OrganismCriteria, OrganismHistoryCriteria>  {




}
