package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Specimen;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Specimen;
import java.util.List;


@Repository
public interface SpecimenDao extends AbstractRepository<Specimen,Long>  {
    Specimen findByCode(String code);
    int deleteByCode(String code);

    List<Specimen> findByReasonId(Long id);
    int deleteByReasonId(Long id);

    @Query("SELECT NEW Specimen(item.id,item.code) FROM Specimen item")
    List<Specimen> findAllOptimized();
}
