package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.DataArchive;
import ma.sir.labo.bean.history.DataArchiveHistory;
import ma.sir.labo.dao.criteria.core.DataArchiveCriteria;
import ma.sir.labo.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.labo.dao.facade.core.DataArchiveDao;
import ma.sir.labo.dao.facade.history.DataArchiveHistoryDao;
import ma.sir.labo.dao.specification.core.DataArchiveSpecification;
import ma.sir.labo.service.facade.admin.DataArchiveAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.LaboratoryAdminService ;


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