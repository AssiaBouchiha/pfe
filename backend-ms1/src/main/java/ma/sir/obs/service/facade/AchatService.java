package ma.sir.obs.service.facade;

import ma.sir.obs.bean.Achat;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AchatService {


    int save(Achat achat);
     int update(Achat achat);
    Achat findByReference(String reference);

    int deleteByReference(String reference);

    int deleteByFournisseurReference(String reference);
    List<Achat> findByMontantAchatLessThan(double montantAchat);

    List<Achat> findByMontantAchatGreaterThan(double montantAchat);

    List<Achat> findAll();
}
