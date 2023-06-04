package ma.sir.obs.service.facade;
import ma.sir.obs.bean.Product;

import java.util.List;

public interface ProductService {

    int save(Product product);

    Product findBypartNumber(String partNumber);

    List findAll();
}
