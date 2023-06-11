package ma.sir.obs.service.facade;
import ma.sir.obs.bean.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    int save(Product product);

    Product findBypartNumber(String partNumber);

    List findAll();
}
