package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Notification;
import ma.sir.obs.dao.criteria.core.NotificationCriteria;
import ma.sir.obs.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface NotificationAdminService extends  IService<Notification,NotificationCriteria, NotificationHistoryCriteria>  {

    List<Notification> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
