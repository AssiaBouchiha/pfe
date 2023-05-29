package ma.sir.obs.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.obs.zynerator.repository.AbstractRepository;
import ma.sir.obs.bean.core.Location;
import org.springframework.stereotype.Repository;
import ma.sir.obs.bean.core.Location;
import java.util.List;


@Repository
public interface LocationDao extends AbstractRepository<Location,Long>  {
    Location findByCode(String code);
    int deleteByCode(String code);

    List<Location> findByInstitutionId(Long id);
    int deleteByInstitutionId(Long id);
    List<Location> findByDepartmentId(Long id);
    int deleteByDepartmentId(Long id);
    List<Location> findByLocationTypeId(Long id);
    int deleteByLocationTypeId(Long id);
    List<Location> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);

    @Query("SELECT NEW Location(item.id,item.code) FROM Location item")
    List<Location> findAllOptimized();
}
