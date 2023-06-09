package ma.sir.obs.dao;

import ma.sir.obs.bean.Store;
import ma.sir.obs.bean.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SupplierDao extends JpaRepository<Supplier,Long> {
    Supplier findByRef (String ref);
    Supplier deleteByRef(String ref);
    List<Supplier> findByRefLikeAndTotalGreaterThan(String ref, double total);

}
