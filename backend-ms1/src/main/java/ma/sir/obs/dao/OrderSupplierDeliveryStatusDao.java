package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierDelivery;
import ma.sir.obs.bean.OrderSupplierDeliveryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierDeliveryStatusDao extends JpaRepository<OrderSupplierDeliveryStatus,Long> {
    OrderSupplierDeliveryStatus findByRef (String ref);
    OrderSupplierDeliveryStatus deleteByRef(String ref);
    List<OrderSupplierDeliveryStatus> findByRefLikeAndTotalGreaterThan(String ref, double total);
}
