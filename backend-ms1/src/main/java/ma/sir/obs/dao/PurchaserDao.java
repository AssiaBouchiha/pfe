package ma.sir.obs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaserDao extends JpaRepository<PurchaserDao,Long> {
        PurchaserDao findByRef (String ref);
      PurchaserDao deleteByRef(String ref);

        List<PurchaserDao> findByRefLikeAndTotalGreaterThan(String ref, double total);

}
