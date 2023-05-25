package ma.sir.labo.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.Patient;
import org.springframework.stereotype.Repository;
import ma.sir.labo.bean.core.Patient;
import java.util.List;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long>  {
    Patient findByCode(String code);
    int deleteByCode(String code);

    List<Patient> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Patient> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);
    List<Patient> findByDataImportExportId(Long id);
    int deleteByDataImportExportId(Long id);

    @Query("SELECT NEW Patient(item.id,item.code) FROM Patient item")
    List<Patient> findAllOptimized();
}
