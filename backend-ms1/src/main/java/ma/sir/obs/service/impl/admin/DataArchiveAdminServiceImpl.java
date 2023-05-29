package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.DataArchive;
import ma.sir.obs.bean.history.DataArchiveHistory;
import ma.sir.obs.dao.criteria.core.DataArchiveCriteria;
import ma.sir.obs.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.obs.dao.facade.core.DataArchiveDao;
import ma.sir.obs.dao.facade.history.DataArchiveHistoryDao;
import ma.sir.obs.dao.specification.core.DataArchiveSpecification;
import ma.sir.obs.service.facade.admin.DataArchiveAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.LaboratoryAdminService ;


import java.util.List;
@Service
public class DataArchiveAdminServiceImpl extends AbstractServiceImpl<DataArchive,DataArchiveHistory, DataArchiveCriteria, DataArchiveHistoryCriteria, DataArchiveDao,
DataArchiveHistoryDao> implements DataArchiveAdminService {



    public DataArchive findByReferenceEntity(DataArchive t){
        return  dao.findByCode(t.getCode());
    }

    public List<DataArchive> findByLaboratoryId(Long id){
        return dao.findByLaboratoryId(id);
    }
    public int deleteByLaboratoryId(Long id){
        return dao.deleteByLaboratoryId(id);
    }




    public void configure() {
        super.configure(DataArchive.class,DataArchiveHistory.class, DataArchiveHistoryCriteria.class, DataArchiveSpecification.class);
    }

    @Autowired
    private LaboratoryAdminService laboratoryService ;

    public DataArchiveAdminServiceImpl(DataArchiveDao dao, DataArchiveHistoryDao historyDao) {
        super(dao, historyDao);
    }

}