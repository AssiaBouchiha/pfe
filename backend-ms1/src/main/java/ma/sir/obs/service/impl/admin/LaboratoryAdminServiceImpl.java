package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Laboratory;
import ma.sir.obs.bean.history.LaboratoryHistory;
import ma.sir.obs.dao.criteria.core.LaboratoryCriteria;
import ma.sir.obs.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.obs.dao.facade.core.LaboratoryDao;
import ma.sir.obs.dao.facade.history.LaboratoryHistoryDao;
import ma.sir.obs.dao.specification.core.LaboratorySpecification;
import ma.sir.obs.service.facade.admin.LaboratoryAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.obs.bean.core.LaboratoryAntibiotic;
import ma.sir.obs.bean.core.Alert;
import ma.sir.obs.bean.core.Notification;

import ma.sir.obs.service.facade.admin.AlertAdminService ;
import ma.sir.obs.service.facade.admin.DataArchiveAdminService ;
import ma.sir.obs.service.facade.admin.LaboratoryAntibioticAdminService ;
import ma.sir.obs.service.facade.admin.LocationAdminService ;
import ma.sir.obs.service.facade.admin.DataAnalysisAdminService ;
import ma.sir.obs.service.facade.admin.NotificationAdminService ;
import ma.sir.obs.service.facade.admin.ReportAdminService ;


import java.util.List;
@Service
public class LaboratoryAdminServiceImpl extends AbstractServiceImpl<Laboratory,LaboratoryHistory, LaboratoryCriteria, LaboratoryHistoryCriteria, LaboratoryDao,
LaboratoryHistoryDao> implements LaboratoryAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Laboratory create(Laboratory t) {
        super.create(t);
        if (t.getLaboratoryAntibiotics() != null) {
                t.getLaboratoryAntibiotics().forEach(element-> {
                    element.setLaboratory(t);
                    laboratoryAntibioticService.create(element);
            });
        }
        if (t.getAlerts() != null) {
                t.getAlerts().forEach(element-> {
                    element.setLaboratory(t);
                    alertService.create(element);
            });
        }
        if (t.getNotifications() != null) {
                t.getNotifications().forEach(element-> {
                    element.setLaboratory(t);
                    notificationService.create(element);
            });
        }
        return t;
    }

    public Laboratory findWithAssociatedLists(Long id){
        Laboratory result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setLaboratoryAntibiotics(laboratoryAntibioticService.findByLaboratoryId(id));
            result.setAlerts(alertService.findByLaboratoryId(id));
            result.setNotifications(notificationService.findByLaboratoryId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        laboratoryAntibioticService.deleteByLaboratoryId(id);
        alertService.deleteByLaboratoryId(id);
        notificationService.deleteByLaboratoryId(id);
    }


    public void updateWithAssociatedLists(Laboratory laboratory){
    if(laboratory !=null && laboratory.getId() != null){
            List<List<LaboratoryAntibiotic>> resultLaboratoryAntibiotics= laboratoryAntibioticService.getToBeSavedAndToBeDeleted(laboratoryAntibioticService.findByLaboratoryId(laboratory.getId()),laboratory.getLaboratoryAntibiotics());
            laboratoryAntibioticService.delete(resultLaboratoryAntibiotics.get(1));
            ListUtil.emptyIfNull(resultLaboratoryAntibiotics.get(0)).forEach(e -> e.setLaboratory(laboratory));
            laboratoryAntibioticService.update(resultLaboratoryAntibiotics.get(0),true);
            List<List<Alert>> resultAlerts= alertService.getToBeSavedAndToBeDeleted(alertService.findByLaboratoryId(laboratory.getId()),laboratory.getAlerts());
            alertService.delete(resultAlerts.get(1));
            ListUtil.emptyIfNull(resultAlerts.get(0)).forEach(e -> e.setLaboratory(laboratory));
            alertService.update(resultAlerts.get(0),true);
            List<List<Notification>> resultNotifications= notificationService.getToBeSavedAndToBeDeleted(notificationService.findByLaboratoryId(laboratory.getId()),laboratory.getNotifications());
            notificationService.delete(resultNotifications.get(1));
            ListUtil.emptyIfNull(resultNotifications.get(0)).forEach(e -> e.setLaboratory(laboratory));
            notificationService.update(resultNotifications.get(0),true);
    }
    }

    public Laboratory findByReferenceEntity(Laboratory t){
        return  dao.findByCode(t.getCode());
    }

    public List<Laboratory> findByLocationId(Long id){
        return dao.findByLocationId(id);
    }
    public int deleteByLocationId(Long id){
        return dao.deleteByLocationId(id);
    }
    public List<Laboratory> findByDataAnalysisId(Long id){
        return dao.findByDataAnalysisId(id);
    }
    public int deleteByDataAnalysisId(Long id){
        return dao.deleteByDataAnalysisId(id);
    }
    public List<Laboratory> findByDataArchiveId(Long id){
        return dao.findByDataArchiveId(id);
    }
    public int deleteByDataArchiveId(Long id){
        return dao.deleteByDataArchiveId(id);
    }
    public List<Laboratory> findByReportId(Long id){
        return dao.findByReportId(id);
    }
    public int deleteByReportId(Long id){
        return dao.deleteByReportId(id);
    }




    public void configure() {
        super.configure(Laboratory.class,LaboratoryHistory.class, LaboratoryHistoryCriteria.class, LaboratorySpecification.class);
    }

    @Autowired
    private AlertAdminService alertService ;
    @Autowired
    private DataArchiveAdminService dataArchiveService ;
    @Autowired
    private LaboratoryAntibioticAdminService laboratoryAntibioticService ;
    @Autowired
    private LocationAdminService locationService ;
    @Autowired
    private DataAnalysisAdminService dataAnalysisService ;
    @Autowired
    private NotificationAdminService notificationService ;
    @Autowired
    private ReportAdminService reportService ;

    public LaboratoryAdminServiceImpl(LaboratoryDao dao, LaboratoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}