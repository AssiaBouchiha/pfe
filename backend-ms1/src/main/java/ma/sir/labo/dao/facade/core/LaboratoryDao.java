package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Laboratory;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Laboratory;
import java.util.List;


@Repository
public interface LaboratoryDao extends AbstractRepository<Laboratory,Long>  {
    Laboratory findByCode(String code);
    int deleteByCode(String code);

    List<Laboratory> findByLocationId(Long id);
    int deleteByLocationId(Long id);
    List<Laboratory> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);
    List<Laboratory> findByDataanalysisId(Long id);
    int deleteByDataanalysisId(Long id);
    List<Laboratory> findByDataarchiveId(Long id);
    int deleteByDataarchiveId(Long id);
    List<Laboratory> findByReportId(Long id);
    int deleteByReportId(Long id);

    @Query("SELECT NEW Laboratory(item.id,item.code) FROM Laboratory item")
    List<Laboratory> findAllOptimized();
}
