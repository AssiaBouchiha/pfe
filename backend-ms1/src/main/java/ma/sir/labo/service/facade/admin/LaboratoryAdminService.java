package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Laboratory;
import ma.sir.labo.dao.criteria.core.LaboratoryCriteria;
import ma.sir.labo.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface LaboratoryAdminService extends  IService<Laboratory,LaboratoryCriteria, LaboratoryHistoryCriteria>  {

    List<Laboratory> findByLocationId(Long id);
    int deleteByLocationId(Long id);
    List<Laboratory> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);
    List<Laboratory> findByDataanalysisId(Long id);
    int deleteByDataanalysisId(Long id);
    List<Laboratory> findByDataarchiveId(Long id);
    int deleteByDataarchiveId(Long id);
    List<Laboratory> findByReportId(Long id);
    int deleteByReportId(Long id);



}
