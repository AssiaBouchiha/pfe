package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.DataAnalysis;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.DataAnalysis;
import java.util.List;


@Repository
public interface DataAnalysisDao extends AbstractRepository<DataAnalysis,Long>  {
    DataAnalysis findByCode(String code);
    int deleteByCode(String code);

    List<DataAnalysis> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW DataAnalysis(item.id,item.code) FROM DataAnalysis item")
    List<DataAnalysis> findAllOptimized();
}
