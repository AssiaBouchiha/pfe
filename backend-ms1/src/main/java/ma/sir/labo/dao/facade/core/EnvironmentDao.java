package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Environment;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Environment;
import java.util.List;


@Repository
public interface EnvironmentDao extends AbstractRepository<Environment,Long>  {
    Environment findByCode(String code);
    int deleteByCode(String code);

    List<Environment> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Environment> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Environment> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);

    @Query("SELECT NEW Environment(item.id,item.code) FROM Environment item")
    List<Environment> findAllOptimized();
}
