package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Report;
import ma.sir.obs.bean.history.ReportHistory;
import ma.sir.obs.dao.criteria.core.ReportCriteria;
import ma.sir.obs.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.obs.dao.facade.core.ReportDao;
import ma.sir.obs.dao.facade.history.ReportHistoryDao;
import ma.sir.obs.dao.specification.core.ReportSpecification;
import ma.sir.obs.service.facade.admin.ReportAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.LaboratoryAdminService ;


import java.util.List;
@Service
public class ReportAdminServiceImpl extends AbstractServiceImpl<Report,ReportHistory, ReportCriteria, ReportHistoryCriteria, ReportDao,
ReportHistoryDao> implements ReportAdminService {



    public Report findByReferenceEntity(Report t){
        return  dao.findByCode(t.getCode());
    }

    public List<Report> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }




    public void configure() {
        super.configure(Report.class,ReportHistory.class, ReportHistoryCriteria.class, ReportSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;

    public ReportAdminServiceImpl(ReportDao dao, ReportHistoryDao historyDao) {
        super(dao, historyDao);
    }

}