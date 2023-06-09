package ma.sir.obs.dao;

import ma.sir.obs.bean.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoreDao extends JpaRepository<Store,Long> {
    Store findByRef (String ref);
    Store deleteByRef(String ref);
    List<Store> findByRefLikeAndTotalGreaterThan(String ref, double total);



}
