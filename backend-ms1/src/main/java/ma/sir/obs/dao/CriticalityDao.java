package ma.sir.obs.dao;

import ma.sir.obs.bean.Criticality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CriticalityDao extends JpaRepository<Criticality,Long> {
    Criticality findBylibelle(String libelle);
    Criticality findBycode(String code);
    Criticality deleteByCode (String code);


}
