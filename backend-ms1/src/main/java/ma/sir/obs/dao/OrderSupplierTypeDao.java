package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplierStatus;
import ma.sir.obs.bean.OrderSupplierType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierTypeDao extends JpaRepository<OrderSupplierType,Long> {
    OrderSupplierType findByRef (String ref);
    OrderSupplierType deleteByRef(String ref);
    List<OrderSupplierType> findByRefLikeAndTotalGreaterThan(String ref, double total);


}
