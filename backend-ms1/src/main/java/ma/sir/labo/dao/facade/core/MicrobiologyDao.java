package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Microbiology;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Microbiology;
import java.util.List;


@Repository
public interface MicrobiologyDao extends AbstractRepository<Microbiology,Long>  {
    Microbiology findByCode(String code);
    int deleteByCode(String code);

    List<Microbiology> findByOrganismId(Long id);
    int deleteByOrganismId(Long id);
    List<Microbiology> findBySeroTypeId(Long id);
    int deleteBySeroTypeId(Long id);
    List<Microbiology> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);
    List<Microbiology> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);

    @Query("SELECT NEW Microbiology(item.id,item.code) FROM Microbiology item")
    List<Microbiology> findAllOptimized();
}
