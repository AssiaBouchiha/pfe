package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Laboratory;
import ma.sir.labo.bean.history.LaboratoryHistory;
import ma.sir.labo.dao.criteria.core.LaboratoryCriteria;
import ma.sir.labo.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.labo.dao.facade.core.LaboratoryDao;
import ma.sir.labo.dao.facade.history.LaboratoryHistoryDao;
import ma.sir.labo.dao.specification.core.LaboratorySpecification;
import ma.sir.labo.service.facade.admin.LaboratoryAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.labo.bean.core.Antibiotic;
import ma.sir.labo.bean.core.Alert;
import ma.sir.labo.bean.core.Notification;

import ma.sir.labo.service.facade.admin.ReportAdminService ;
import ma.sir.labo.service.facade.admin.AlertAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.NotificationAdminService ;
import ma.sir.labo.service.facade.admin.LocationAdminService ;
import ma.sir.labo.service.facade.admin.DataArchiveAdminService ;
import ma.sir.labo.service.facade.admin.DataAnalysisAdminService ;
import ma.sir.labo.service.facade.admin.AntibioticAdminService ;


import java.util.List;
@Service
public class LaboratoryAdminServiceImpl extends AbstractServiceImpl<Laboratory,LaboratoryHistory, LaboratoryCriteria, LaboratoryHistoryCriteria, LaboratoryDao,
LaboratoryHistoryDao> implements LaboratoryAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Laboratory create(Laboratory t) {
        super.create(t);
        if (t.getAntibiotic() != null) {
                t.getAntibiotic().forEach(element-> {
                    element.setLaboratory(t);
                    antibioticService.create(element);
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
            result.setAntibiotic(antibioticService.findByLaboratoryId(id));
            result.setAlerts(alertService.findByLaboratoryId(id));
            result.setNotifications(notificationService.findByLaboratoryId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        antibioticService.deleteByLaboratoryId(id);
        alertService.deleteByLaboratoryId(id);
        notificationService.deleteByLaboratoryId(id);
    }


    public void updateWithAssociatedLists(Laboratory laboratory){
    if(laboratory !=null && laboratory.getId() != null){
            List<List<Antibiotic>> resultAntibiotic= antibioticService.getToBeSavedAndToBeDeleted(antibioticService.findByLaboratoryId(laboratory.getId()),laboratory.getAntibiotic());
            antibioticService.delete(resultAntibiotic.get(1));
            ListUtil.emptyIfNull(resultAntibiotic.get(0)).forEach(e -> e.setLaboratory(laboratory));
            antibioticService.update(resultAntibiotic.get(0),true);
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
    public List<Laboratory> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }
    public List<Laboratory> findByDataanalysisId(Long id){
        return dao.findByDataanalysisId(id);
    }
    public int deleteByDataanalysisId(Long id){
        return dao.deleteByDataanalysisId(id);
    }
    public List<Laboratory> findByDataarchiveId(Long id){
        return dao.findByDataarchiveId(id);
    }
    public int deleteByDataarchiveId(Long id){
        return dao.deleteByDataarchiveId(id);
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
    private ReportAdminService reportService ;
    @Autowired
    private AlertAdminService alertService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private NotificationAdminService notificationService ;
    @Autowired
    private LocationAdminService locationService ;
    @Autowired
    private DataArchiveAdminService dataArchiveService ;
    @Autowired
    private DataAnalysisAdminService dataAnalysisService ;
    @Autowired
    private AntibioticAdminService antibioticService ;

    public LaboratoryAdminServiceImpl(LaboratoryDao dao, LaboratoryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}