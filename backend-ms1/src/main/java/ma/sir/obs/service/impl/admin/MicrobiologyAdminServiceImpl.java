package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Microbiology;
import ma.sir.obs.bean.history.MicrobiologyHistory;
import ma.sir.obs.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.obs.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.obs.dao.facade.core.MicrobiologyDao;
import ma.sir.obs.dao.facade.history.MicrobiologyHistoryDao;
import ma.sir.obs.dao.specification.core.MicrobiologySpecification;
import ma.sir.obs.service.facade.admin.MicrobiologyAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.SeroTypeAdminService ;
import ma.sir.obs.service.facade.admin.OrganismAdminService ;
import ma.sir.obs.service.facade.admin.AntibioticAdminService ;


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




    public void configure() {
        super.configure(Microbiology.class,MicrobiologyHistory.class, MicrobiologyHistoryCriteria.class, MicrobiologySpecification.class);
    }

    @Autowired
    private SeroTypeAdminService seroTypeService ;
    @Autowired
    private OrganismAdminService organismService ;
    @Autowired
    private AntibioticAdminService antibioticService ;

    public MicrobiologyAdminServiceImpl(MicrobiologyDao dao, MicrobiologyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}