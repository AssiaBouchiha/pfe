package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Environment;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Environment;
import java.util.List;


@Repository
public interface EnvironmentDao extends AbstractRepository<Environment,Long>  {
    Environment findByCode(String code);
    int deleteByCode(String code);

    List<Environment> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Environment> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);

    @Query("SELECT NEW Environment(item.id,item.code) FROM Environment item")
    List<Environment> findAllOptimized();
}
