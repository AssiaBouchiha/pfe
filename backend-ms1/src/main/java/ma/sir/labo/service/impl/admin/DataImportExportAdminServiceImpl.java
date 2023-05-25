package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.DataImportExport;
import ma.sir.labo.bean.history.DataImportExportHistory;
import ma.sir.labo.dao.criteria.core.DataImportExportCriteria;
import ma.sir.labo.dao.criteria.history.DataImportExportHistoryCriteria;
import ma.sir.labo.dao.facade.core.DataImportExportDao;
import ma.sir.labo.dao.facade.history.DataImportExportHistoryDao;
import ma.sir.labo.dao.specification.core.DataImportExportSpecification;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.MicrobiologyAdminService ;
import ma.sir.labo.service.facade.admin.SpecimenAdminService ;
import ma.sir.labo.service.facade.admin.LocationDataAdminService ;


import java.util.List;
@Service
public class DataImportExportAdminServiceImpl extends AbstractServiceImpl<DataImportExport,DataImportExportHistory, DataImportExportCriteria, DataImportExportHistoryCriteria, DataImportExportDao,
DataImportExportHistoryDao> implements DataImportExportAdminService {


    public DataImportExport findByReferenceEntity(DataImportExport t){
        return  dao.findByCode(t.getCode());
    }

    public List<DataImportExport> findByLocationDataId(Long id){
        return dao.findByLocationDataId(id);
    }
    public int deleteByLocationDataId(Long id){
        return dao.deleteByLocationDataId(id);
    }
    public List<DataImportExport> findBySpecimenId(Long id){
        return dao.findBySpecimenId(id);
    }
    public int deleteBySpecimenId(Long id){
        return dao.deleteBySpecimenId(id);
    }
    public List<DataImportExport> findByMicrobiologyId(Long id){
        return dao.findByMicrobiologyId(id);
    }
    public int deleteByMicrobiologyId(Long id){
        return dao.deleteByMicrobiologyId(id);
    }



    public void configure() {
        super.configure(DataImportExport.class,DataImportExportHistory.class, DataImportExportHistoryCriteria.class, DataImportExportSpecification.class);
    }

    @Autowired
    private MicrobiologyAdminService microbiologyService ;
    @Autowired
    private SpecimenAdminService specimenService ;
    @Autowired
    private LocationDataAdminService locationDataService ;

    public DataImportExportAdminServiceImpl(DataImportExportDao dao, DataImportExportHistoryDao historyDao) {
        super(dao, historyDao);
    }

}