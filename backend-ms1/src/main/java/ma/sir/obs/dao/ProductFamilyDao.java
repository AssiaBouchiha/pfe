package ma.sir.obs.dao;

import ma.sir.obs.bean.ProductFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductFamilyDao extends JpaRepository<ProductFamily,Long> {
    ProductFamily findByCode(String code);
    int deleteByCode(String code);
}

