package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Alert;
import ma.sir.obs.dao.criteria.core.AlertCriteria;
import ma.sir.obs.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface AlertAdminService extends  IService<Alert,AlertCriteria, AlertHistoryCriteria>  {

    List<Alert> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
