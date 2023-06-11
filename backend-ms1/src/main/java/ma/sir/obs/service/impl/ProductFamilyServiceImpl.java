package ma.sir.obs.service.impl;

import ma.sir.obs.bean.Product;
import ma.sir.obs.bean.ProductFamily;
import ma.sir.obs.dao.ProductDao;
import ma.sir.obs.dao.ProductFamilyDao;
import ma.sir.obs.service.facade.ProductFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductFamilyServiceImpl implements ProductFamilyService {


    @Autowired
    private ProductFamilyDao productFamilyDao;

    @Override
    public int save(ProductFamily productFamily) {
        if (findByCode(productFamily.getCode()) != null) {
            return -1;
        } else {
            productFamilyDao.save(productFamily);
            return 1;
        }
    }
    @Override
    public ProductFamily findByCode(String code) {
        return productFamilyDao.findByCode(code);
    }

    @Override
    public List<ProductFamily> findAll() {
        return productFamilyDao.findAll();
    }
}
