package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.Microbiology;
import ma.sir.labo.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.labo.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface MicrobiologyAdminService extends  IService<Microbiology,MicrobiologyCriteria, MicrobiologyHistoryCriteria>  {

    List<Microbiology> findByOrganismId(Long id);
    int deleteByOrganismId(Long id);
    List<Microbiology> findBySeroTypeId(Long id);
    int deleteBySeroTypeId(Long id);
    List<Microbiology> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);
    List<Microbiology> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);



}
