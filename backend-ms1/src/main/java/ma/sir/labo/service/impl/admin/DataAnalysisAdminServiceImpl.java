package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.DataAnalysis;
import ma.sir.labo.bean.history.DataAnalysisHistory;
import ma.sir.labo.dao.criteria.core.DataAnalysisCriteria;
import ma.sir.labo.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.labo.dao.facade.core.DataAnalysisDao;
import ma.sir.labo.dao.facade.history.DataAnalysisHistoryDao;
import ma.sir.labo.dao.specification.core.DataAnalysisSpecification;
import ma.sir.labo.service.facade.admin.DataAnalysisAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.LaboratoryAdminService ;


import java.util.List;
@Service
public class DataAnalysisAdminServiceImpl extends AbstractServiceImpl<DataAnalysis,DataAnalysisHistory, DataAnalysisCriteria, DataAnalysisHistoryCriteria, DataAnalysisDao,
DataAnalysisHistoryDao> implements DataAnalysisAdminService {


    public DataAnalysis findByReferenceEntity(DataAnalysis t){
        return  dao.findByCode(t.getCode());
    }

    public List<DataAnalysis> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }



    public void configure() {
        super.configure(DataAnalysis.class,DataAnalysisHistory.class, DataAnalysisHistoryCriteria.class, DataAnalysisSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;

    public DataAnalysisAdminServiceImpl(DataAnalysisDao dao, DataAnalysisHistoryDao historyDao) {
        super(dao, historyDao);
    }

}