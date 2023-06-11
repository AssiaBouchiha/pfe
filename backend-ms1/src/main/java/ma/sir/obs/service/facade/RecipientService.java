package ma.sir.obs.service.facade;
import ma.sir.obs.bean.Recipient;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface RecipientService {

    int save(Recipient recipient);
    Recipient findByCode(String code);
    int deleteByCode (String code);
    List<Recipient> findAll();
}
