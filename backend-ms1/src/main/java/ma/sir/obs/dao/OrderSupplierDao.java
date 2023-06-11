package ma.sir.obs.dao;

import ma.sir.obs.bean.OrderSupplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderSupplierDao extends JpaRepository<OrderSupplier, Long> {

    OrderSupplier findByReference(String reference);
    int deleteByReference(String reference);
}
