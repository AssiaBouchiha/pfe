package ma.sir.obs.service.impl.admin;

import ma.sir.obs.bean.core.Specimen;
import ma.sir.obs.bean.history.SpecimenHistory;
import ma.sir.obs.dao.criteria.core.SpecimenCriteria;
import ma.sir.obs.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.obs.dao.facade.core.SpecimenDao;
import ma.sir.obs.dao.facade.history.SpecimenHistoryDao;
import ma.sir.obs.dao.specification.core.SpecimenSpecification;
import ma.sir.obs.service.facade.admin.SpecimenAdminService;
import ma.sir.obs.zynerator.service.AbstractServiceImpl;
import ma.sir.obs.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.obs.service.facade.admin.ReasonAdminService ;


import java.util.List;
@Service
public class SpecimenAdminServiceImpl extends AbstractServiceImpl<Specimen,SpecimenHistory, SpecimenCriteria, SpecimenHistoryCriteria, SpecimenDao,
SpecimenHistoryDao> implements SpecimenAdminService {



    public Specimen findByReferenceEntity(Specimen t){
        return  dao.findByCode(t.getCode());
    }

    public List<Specimen> findByReasonId(Long id){
        return dao.findByReasonId(id);
    }
    public int deleteByReasonId(Long id){
        return dao.deleteByReasonId(id);
    }




    public void configure() {
        super.configure(Specimen.class,SpecimenHistory.class, SpecimenHistoryCriteria.class, SpecimenSpecification.class);
    }

    @Autowired
    private ReasonAdminService reasonService ;

    public SpecimenAdminServiceImpl(SpecimenDao dao, SpecimenHistoryDao historyDao) {
        super(dao, historyDao);
    }

}