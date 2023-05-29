package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Report;
import ma.sir.obs.dao.criteria.core.ReportCriteria;
import ma.sir.obs.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface ReportAdminService extends  IService<Report,ReportCriteria, ReportHistoryCriteria>  {

    List<Report> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
