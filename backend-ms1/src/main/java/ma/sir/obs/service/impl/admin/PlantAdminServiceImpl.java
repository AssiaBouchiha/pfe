package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Plant;
import ma.sir.obs.bean.history.PlantHistory;
import ma.sir.obs.dao.criteria.core.PlantCriteria;
import ma.sir.obs.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.obs.dao.facade.core.PlantDao;
import ma.sir.obs.dao.facade.history.PlantHistoryDao;
import ma.sir.obs.dao.specification.core.PlantSpecification;
import ma.sir.obs.service.facade.admin.PlantAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.GenderAdminService ;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService ;


import java.util.List;
@Service
public class PlantAdminServiceImpl extends AbstractServiceImpl<Plant,PlantHistory, PlantCriteria, PlantHistoryCriteria, PlantDao,
PlantHistoryDao> implements PlantAdminService {



    public Plant findByReferenceEntity(Plant t){
        return  dao.findByCode(t.getCode());
    }

    public List<Plant> findByGenderId(Long id){
        return dao.findByGenderId(id);
    }
    public int deleteByGenderId(Long id){
        return dao.deleteByGenderId(id);
    }
    public List<Plant> findByAgeCategoryId(Long id){
        return dao.findByAgeCategoryId(id);
    }
    public int deleteByAgeCategoryId(Long id){
        return dao.deleteByAgeCategoryId(id);
    }




    public void configure() {
        super.configure(Plant.class,PlantHistory.class, PlantHistoryCriteria.class, PlantSpecification.class);
    }

    @Autowired
    private GenderAdminService genderService ;
    @Autowired
    private AgeCategoryAdminService ageCategoryService ;

    public PlantAdminServiceImpl(PlantDao dao, PlantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}