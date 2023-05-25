package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Microbiology;
import ma.sir.labo.bean.history.MicrobiologyHistory;
import ma.sir.labo.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.labo.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.labo.dao.facade.core.MicrobiologyDao;
import ma.sir.labo.dao.facade.history.MicrobiologyHistoryDao;
import ma.sir.labo.dao.specification.core.MicrobiologySpecification;
import ma.sir.labo.service.facade.admin.MicrobiologyAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.SeroTypeAdminService ;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.AntibioticAdminService ;
import ma.sir.labo.service.facade.admin.OrganismAdminService ;


import java.util.List;
@Service
public class MicrobiologyAdminServiceImpl extends AbstractServiceImpl<Microbiology,MicrobiologyHistory, MicrobiologyCriteria, MicrobiologyHistoryCriteria, MicrobiologyDao,
MicrobiologyHistoryDao> implements MicrobiologyAdminService {


    public Microbiology findByReferenceEntity(Microbiology t){
        return  dao.findByCode(t.getCode());
    }

    public List<Microbiology> findByOrganismId(Long id){
        return dao.findByOrganismId(id);
    }
    public int deleteByOrganismId(Long id){
        return dao.deleteByOrganismId(id);
    }
    public List<Microbiology> findBySeroTypeId(Long id){
        return dao.findBySeroTypeId(id);
    }
    public int deleteBySeroTypeId(Long id){
        return dao.deleteBySeroTypeId(id);
    }
    public List<Microbiology> findByAntibioticId(Long id){
        return dao.findByAntibioticId(id);
    }
    public int deleteByAntibioticId(Long id){
        return dao.deleteByAntibioticId(id);
    }
    public List<Microbiology> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Microbiology.class,MicrobiologyHistory.class, MicrobiologyHistoryCriteria.class, MicrobiologySpecification.class);
    }

    @Autowired
    private SeroTypeAdminService seroTypeService ;
    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private AntibioticAdminService antibioticService ;
    @Autowired
    private OrganismAdminService organismService ;

    public MicrobiologyAdminServiceImpl(MicrobiologyDao dao, MicrobiologyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}