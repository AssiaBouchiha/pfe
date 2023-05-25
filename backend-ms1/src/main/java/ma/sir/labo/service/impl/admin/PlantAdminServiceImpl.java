package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Plant;
import ma.sir.labo.bean.history.PlantHistory;
import ma.sir.labo.dao.criteria.core.PlantCriteria;
import ma.sir.labo.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.labo.dao.facade.core.PlantDao;
import ma.sir.labo.dao.facade.history.PlantHistoryDao;
import ma.sir.labo.dao.specification.core.PlantSpecification;
import ma.sir.labo.service.facade.admin.PlantAdminService;
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
    public List<Plant> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Plant.class,PlantHistory.class, PlantHistoryCriteria.class, PlantSpecification.class);
    }

    @Autowired
    private AgeCategoryAdminService ageCategoryService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private GenderAdminService genderService ;

    public PlantAdminServiceImpl(PlantDao dao, PlantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}