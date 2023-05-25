package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Notification;
import ma.sir.labo.bean.history.NotificationHistory;
import ma.sir.labo.dao.criteria.core.NotificationCriteria;
import ma.sir.labo.dao.criteria.history.NotificationHistoryCriteria;
import ma.sir.labo.dao.facade.core.NotificationDao;
import ma.sir.labo.dao.facade.history.NotificationHistoryDao;
import ma.sir.labo.dao.specification.core.NotificationSpecification;
import ma.sir.labo.service.facade.admin.NotificationAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.LaboratoryAdminService ;


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