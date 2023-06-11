package ma.sir.obs.dao;

import antlr.collections.List;
import ma.sir.obs.bean.OrderSupplierDelivery;
import ma.sir.obs.bean.OrderSupplierDeliveryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderSupplierDeliveryProductDao extends JpaRepository<OrderSupplierDeliveryProduct, Long> {


}
