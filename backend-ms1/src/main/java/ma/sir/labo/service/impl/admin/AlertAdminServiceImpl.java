package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Alert;
import ma.sir.labo.bean.history.AlertHistory;
import ma.sir.labo.dao.criteria.core.AlertCriteria;
import ma.sir.labo.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.labo.dao.facade.core.AlertDao;
import ma.sir.labo.dao.facade.history.AlertHistoryDao;
import ma.sir.labo.dao.specification.core.AlertSpecification;
import ma.sir.labo.service.facade.admin.AlertAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.LaboratoryAdminService ;


import java.util.List;
@Service
public class AlertAdminServiceImpl extends AbstractServiceImpl<Alert,AlertHistory, AlertCriteria, AlertHistoryCriteria, AlertDao,
AlertHistoryDao> implements AlertAdminService {


    public Alert findByReferenceEntity(Alert t){
        return  dao.findByCode(t.getCode());
    }

    public List<Alert> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }



    public void configure() {
        super.configure(Alert.class,AlertHistory.class, AlertHistoryCriteria.class, AlertSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;

    public AlertAdminServiceImpl(AlertDao dao, AlertHistoryDao historyDao) {
        super(dao, historyDao);
    }

}