package ma.sir.obs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductFamilyDao extends JpaRepository<ProductFamilyDao,Long> {
    ProductFamilyDao findByRef (String ref);
    ProductFamilyDao deleteByRef(String ref);
    List<ProductFamilyDao> findByRefLikeAndTotalGreaterThan(String ref, double total);
}

