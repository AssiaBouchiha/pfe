package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierDelivery;
import ma.sir.obs.bean.OrderSupplierProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierProductDao extends JpaRepository<OrderSupplierProduct,Long> {
    OrderSupplierProduct findByRef (String ref);
    OrderSupplierProduct deleteByRef(String ref);
    List<OrderSupplierProduct> findByRefLikeAndTotalGreaterThan(String ref, double total);
}
