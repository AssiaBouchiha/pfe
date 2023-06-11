package ma.sir.obs.service.facade;


import ma.sir.obs.bean.ProductFamily;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductFamilyService {
    int save(ProductFamily productfamily);

    ProductFamily findByCode(String Code);

    List<ProductFamily> findAll();
}
