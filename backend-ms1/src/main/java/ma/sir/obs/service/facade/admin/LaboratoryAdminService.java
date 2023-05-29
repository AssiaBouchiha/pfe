package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.Laboratory;
import ma.sir.obs.dao.criteria.core.LaboratoryCriteria;
import ma.sir.obs.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface LaboratoryAdminService extends  IService<Laboratory,LaboratoryCriteria, LaboratoryHistoryCriteria>  {

    List<Laboratory> findByLocationId(Long id);
    int deleteByLocationId(Long id);
    List<Laboratory> findByDataAnalysisId(Long id);
    int deleteByDataAnalysisId(Long id);
    List<Laboratory> findByDataArchiveId(Long id);
    int deleteByDataArchiveId(Long id);
    List<Laboratory> findByReportId(Long id);
    int deleteByReportId(Long id);



}
