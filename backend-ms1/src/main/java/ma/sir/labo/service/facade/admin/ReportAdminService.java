package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Report;
import ma.sir.labo.dao.criteria.core.ReportCriteria;
import ma.sir.labo.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface ReportAdminService extends  IService<Report,ReportCriteria, ReportHistoryCriteria>  {

    List<Report> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
