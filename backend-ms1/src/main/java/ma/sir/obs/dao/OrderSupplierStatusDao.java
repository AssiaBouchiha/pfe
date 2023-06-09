package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierProduct;
import ma.sir.obs.bean.OrderSupplierStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierStatusDao extends JpaRepository<OrderSupplierStatus,Long> {
    OrderSupplierStatus findByRef (String ref);
    OrderSupplierStatus deleteByRef(String ref);
    List<OrderSupplierStatus> findByRefLikeAndTotalGreaterThan(String ref, double total);

}
