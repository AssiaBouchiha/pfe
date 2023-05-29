package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Notification;
import ma.sir.obs.bean.history.NotificationHistory;
import ma.sir.obs.dao.criteria.core.NotificationCriteria;
import ma.sir.obs.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.obs.dao.facade.core.NotificationDao;
import ma.sir.obs.dao.facade.history.NotificationHistoryDao;
import ma.sir.obs.dao.specification.core.NotificationSpecification;
import ma.sir.obs.service.facade.admin.NotificationAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.LaboratoryAdminService ;


import java.util.List;
@Service
public class NotificationAdminServiceImpl extends AbstractServiceImpl<Notification,NotificationHistory, NotificationCriteria, NotificationHistoryCriteria, NotificationDao,
NotificationHistoryDao> implements NotificationAdminService {



    public Notification findByReferenceEntity(Notification t){
        return  dao.findByCode(t.getCode());
    }

    public List<Notification> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }




    public void configure() {
        super.configure(Notification.class,NotificationHistory.class, NotificationHistoryCriteria.class, NotificationSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;

    public NotificationAdminServiceImpl(NotificationDao dao, NotificationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}