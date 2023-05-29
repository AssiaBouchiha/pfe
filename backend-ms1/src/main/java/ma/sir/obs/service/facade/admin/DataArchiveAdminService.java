package ma.sir.obs.service.facade.admin;

import java.util.List;
import ma.sir.obs.bean.core.DataArchive;
import ma.sir.obs.dao.criteria.core.DataArchiveCriteria;
import ma.sir.obs.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.obs.zynerator.service.IService;


public interface DataArchiveAdminService extends  IService<DataArchive,DataArchiveCriteria, DataArchiveHistoryCriteria>  {

    List<DataArchive> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);



}
