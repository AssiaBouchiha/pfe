package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.DataAnalysis;
import ma.sir.labo.dao.criteria.core.DataAnalysisCriteria;
import ma.sir.labo.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface DataAnalysisAdminService extends  IService<DataAnalysis,DataAnalysisCriteria, DataAnalysisHistoryCriteria>  {

    List<DataAnalysis> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
