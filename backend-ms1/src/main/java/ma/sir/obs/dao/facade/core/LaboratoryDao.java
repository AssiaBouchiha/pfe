package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Laboratory;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Laboratory;
import java.util.List;


@Repository
public interface LaboratoryDao extends AbstractRepository<Laboratory,Long>  {
    Laboratory findByCode(String code);
    int deleteByCode(String code);

    List<Laboratory> findByLocationId(Long id);
    int deleteByLocationId(Long id);
    List<Laboratory> findByDataAnalysisId(Long id);
    int deleteByDataAnalysisId(Long id);
    List<Laboratory> findByDataArchiveId(Long id);
    int deleteByDataArchiveId(Long id);
    List<Laboratory> findByReportId(Long id);
    int deleteByReportId(Long id);

    @Query("SELECT NEW Laboratory(item.id,item.code) FROM Laboratory item")
    List<Laboratory> findAllOptimized();
}
