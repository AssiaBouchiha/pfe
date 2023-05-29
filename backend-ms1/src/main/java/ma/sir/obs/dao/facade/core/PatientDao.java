package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Patient;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Patient;
import java.util.List;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long>  {
    Patient findByCode(String code);
    int deleteByCode(String code);

    List<Patient> findByGenderId(Long id);
    int deleteByGenderId(Long id);
    List<Patient> findByAgeCategoryId(Long id);
    int deleteByAgeCategoryId(Long id);

    @Query("SELECT NEW Patient(item.id,item.code) FROM Patient item")
    List<Patient> findAllOptimized();
}
