package ma.sir.labo.service.facade.admin;

import java.util.List;
import ma.sir.labo.bean.core.DataArchive;
import ma.sir.labo.dao.criteria.core.DataArchiveCriteria;
import ma.sir.labo.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.labo.zynerator.service.IService;


public interface DataArchiveAdminService extends  IService<DataArchive,DataArchiveCriteria, DataArchiveHistoryCriteria>  {

    List<DataArchive> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
