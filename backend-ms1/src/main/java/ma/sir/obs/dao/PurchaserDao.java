package ma.sir.obs.dao;

import ma.sir.obs.bean.Purchaser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaserDao extends JpaRepository<Purchaser,Long> {


}
