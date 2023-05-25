package ma.sir.labo.service.impl.admin;

import ma.sir.labo.bean.core.Specimen;
import ma.sir.labo.bean.history.SpecimenHistory;
import ma.sir.labo.dao.criteria.core.SpecimenCriteria;
import ma.sir.labo.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.labo.dao.facade.core.SpecimenDao;
import ma.sir.labo.dao.facade.history.SpecimenHistoryDao;
import ma.sir.labo.dao.specification.core.SpecimenSpecification;
import ma.sir.labo.service.facade.admin.SpecimenAdminService;
import ma.sir.labo.zynerator.service.AbstractServiceImpl;
import ma.sir.labo.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.labo.service.facade.admin.DataImportExportAdminService ;
import ma.sir.labo.service.facade.admin.ReasonAdminService ;


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
    public List<Specimen> findByDataImportExportId(Long id){
        return dao.findByDataImportExportId(id);
    }
    public int deleteByDataImportExportId(Long id){
        return dao.deleteByDataImportExportId(id);
    }



    public void configure() {
        super.configure(Specimen.class,SpecimenHistory.class, SpecimenHistoryCriteria.class, SpecimenSpecification.class);
    }

    @Autowired
    private DataImportExportAdminService dataImportExportService ;
    @Autowired
    private ReasonAdminService reasonService ;

    public SpecimenAdminServiceImpl(SpecimenDao dao, SpecimenHistoryDao historyDao) {
        super(dao, historyDao);
    }

}