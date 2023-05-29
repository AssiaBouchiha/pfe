package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Environment;
import ma.sir.obs.bean.history.EnvironmentHistory;
import ma.sir.obs.dao.criteria.core.EnvironmentCriteria;
import ma.sir.obs.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.obs.dao.facade.core.EnvironmentDao;
import ma.sir.obs.dao.facade.history.EnvironmentHistoryDao;
import ma.sir.obs.dao.specification.core.EnvironmentSpecification;
import ma.sir.obs.service.facade.admin.EnvironmentAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.GenderAdminService ;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService ;


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




    public void configure() {
        super.configure(Environment.class,EnvironmentHistory.class, EnvironmentHistoryCriteria.class, EnvironmentSpecification.class);
    }

    @Autowired
    private GenderAdminService genderService ;
    @Autowired
    private AgeCategoryAdminService ageCategoryService ;

    public EnvironmentAdminServiceImpl(EnvironmentDao dao, EnvironmentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}