package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Alert;
import ma.sir.labo.dao.criteria.core.AlertCriteria;
import ma.sir.labo.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface AlertAdminService extends  IService<Alert,AlertCriteria, AlertHistoryCriteria>  {

    List<Alert> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
