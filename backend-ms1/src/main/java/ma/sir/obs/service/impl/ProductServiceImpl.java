package ma.sir.obs.service.impl;

import ma.sir.obs.bean.Product;
import ma.sir.obs.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public int save(Product product) {
        if (findBypartNumber(product.getPartNumber()) != null) {
            return -1;
        } else {
            productDao.save(product);
            return 1;
        }
    }

    @Override
    public Product findBypartNumber(String partNumber) {
        return productDao.findBypartNumber(partNumber);
    }
    @Override
    public List findAll() {
        return productDao.findAll();
    }
}
