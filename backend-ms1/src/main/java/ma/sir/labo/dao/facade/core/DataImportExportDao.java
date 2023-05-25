package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.DataImportExport;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.DataImportExport;
import java.util.List;


@Repository
public interface DataImportExportDao extends AbstractRepository<DataImportExport,Long>  {
    DataImportExport findByCode(String code);
    int deleteByCode(String code);

    List<DataImportExport> findByLocationDataId(Long id);
    int deleteByLocationDataId(Long id);
    List<DataImportExport> findBySpecimenId(Long id);
    int deleteBySpecimenId(Long id);
    List<DataImportExport> findByMicrobiologyId(Long id);
    int deleteByMicrobiologyId(Long id);

    @Query("SELECT NEW DataImportExport(item.id,item.code) FROM DataImportExport item")
    List<DataImportExport> findAllOptimized();
}
