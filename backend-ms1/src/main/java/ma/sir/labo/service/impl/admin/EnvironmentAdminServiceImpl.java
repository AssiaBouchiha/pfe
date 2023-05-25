package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Environment;
import ma.sir.labo.bean.history.EnvironmentHistory;
import ma.sir.labo.dao.criteria.core.EnvironmentCriteria;
import ma.sir.labo.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.labo.dao.facade.core.EnvironmentDao;
import ma.sir.labo.dao.facade.history.EnvironmentHistoryDao;
import ma.sir.labo.dao.specification.core.EnvironmentSpecification;
import ma.sir.labo.service.facade.admin.EnvironmentAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.AgeCategoryAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.GenderAdminService ;


import java.util.List;
@Service
public class EnvironmentAdminServiceImpl extends AbstractServiceImpl<Environment,EnvironmentHistory, EnvironmentCriteria, EnvironmentHistoryCriteria, EnvironmentDao,
EnvironmentHistoryDao> implements EnvironmentAdminService {


    public Environment findByReferenceEntity(Environment t){
        return  dao.findByCode(t.getCode());
    }

    public List<Environment> findByGenderId(Long id){
        return dao.findByGenderId(id);
    }
    public int deleteByGenderId(Long id){
        return dao.deleteByGenderId(id);
    }
    public List<Environment> findByAgeCategoryId(Long id){
        return dao.findByAgeCategoryId(id);
    }
    public int deleteByAgeCategoryId(Long id){
        return dao.deleteByAgeCategoryId(id);
    }
    public List<Environment> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Environment.class,EnvironmentHistory.class, EnvironmentHistoryCriteria.class, EnvironmentSpecification.class);
    }

    @Autowired
    private AgeCategoryAdminService ageCategoryService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private GenderAdminService genderService ;

    public EnvironmentAdminServiceImpl(EnvironmentDao dao, EnvironmentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}