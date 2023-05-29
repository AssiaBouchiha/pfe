package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.DataAnalysis;
import ma.sir.obs.dao.criteria.core.DataAnalysisCriteria;
import ma.sir.obs.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface DataAnalysisAdminService extends  IService<DataAnalysis,DataAnalysisCriteria, DataAnalysisHistoryCriteria>  {

    List<DataAnalysis> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
