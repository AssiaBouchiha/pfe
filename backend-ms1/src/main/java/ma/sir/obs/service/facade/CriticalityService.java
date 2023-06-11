package ma.sir.obs.service.facade;

import ma.sir.obs.bean.Criticality;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CriticalityService {


    int save(Criticality achat);
     int update(Criticality achat);
    Criticality findByReference(String code);

    int deleteByReference(String code);

    int deleteByFournisseurReference(String code);
    List<Criticality> findByMontantCriticalityLessThan(double montantCriticality);

    List<Criticality> findByMontantCriticalityGreaterThan(double montantCriticality);

    List<Criticality> findAll();
}
