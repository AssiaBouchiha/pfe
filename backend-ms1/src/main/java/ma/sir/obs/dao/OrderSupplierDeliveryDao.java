package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierDeliveryDao extends JpaRepository<OrderSupplierDelivery,Long> {
    OrderSupplierDelivery findByRef (String ref);
    OrderSupplierDelivery deleteByRef(String ref);
    List<OrderSupplierDelivery> findByRefLikeAndTotalGreaterThan(String ref, double total);
}
