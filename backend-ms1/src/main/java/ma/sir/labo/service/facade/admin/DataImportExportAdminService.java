package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.DataImportExport;
import ma.sir.labo.dao.criteria.core.DataImportExportCriteria;
import ma.sir.labo.dao.criteria.history.DataImportExportHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface DataImportExportAdminService extends  IService<DataImportExport,DataImportExportCriteria, DataImportExportHistoryCriteria>  {

    List<DataImportExport> findByLocationDataId(Long id);
    int deleteByLocationDataId(Long id);
    List<DataImportExport> findBySpecimenId(Long id);
    int deleteBySpecimenId(Long id);
    List<DataImportExport> findByMicrobiologyId(Long id);
    int deleteByMicrobiologyId(Long id);



}
