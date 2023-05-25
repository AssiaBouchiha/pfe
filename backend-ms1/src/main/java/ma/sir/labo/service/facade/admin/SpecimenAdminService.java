package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Specimen;
import ma.sir.labo.dao.criteria.core.SpecimenCriteria;
import ma.sir.labo.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface SpecimenAdminService extends  IService<Specimen,SpecimenCriteria, SpecimenHistoryCriteria>  {

    List<Specimen> findByReasonId(Long id);
    int deleteByReasonId(Long id);
    List<Specimen> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
