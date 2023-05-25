package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.DataArchive;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.DataArchive;
import java.util.List;


@Repository
public interface DataArchiveDao extends AbstractRepository<DataArchive,Long>  {
    DataArchive findByCode(String code);
    int deleteByCode(String code);

    List<DataArchive> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW DataArchive(item.id,item.code) FROM DataArchive item")
    List<DataArchive> findAllOptimized();
}
