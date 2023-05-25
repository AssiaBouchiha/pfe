package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Notification;
import ma.sir.labo.dao.criteria.core.NotificationCriteria;
import ma.sir.labo.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface NotificationAdminService extends  IService<Notification,NotificationCriteria, NotificationHistoryCriteria>  {

    List<Notification> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
