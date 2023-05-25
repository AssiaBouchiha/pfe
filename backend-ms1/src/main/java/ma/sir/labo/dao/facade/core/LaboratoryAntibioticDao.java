package ma.sir.labo.dao.facade.core;

import ma.sir.labo.zynerator.repository.AbstractRepository;
import ma.sir.labo.bean.core.LaboratoryAntibiotic;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface LaboratoryAntibioticDao extends AbstractRepository<LaboratoryAntibiotic,Long>  {

    List<LaboratoryAntibiotic> findByLaboratoryId(Long id);
    int deleteByLaboratoryId(Long id);
    List<LaboratoryAntibiotic> findByAntibioticId(Long id);
    int deleteByAntibioticId(Long id);

}
