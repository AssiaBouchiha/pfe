package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierType;
import ma.sir.obs.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
    Product findByRef (String ref);
    Product deleteByRef(String ref);
    List<Product> findByRefLikeAndTotalGreaterThan(String ref, double total);

}
