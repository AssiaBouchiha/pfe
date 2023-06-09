package ma.sir.obs.dao;

import ma.sir.obs.bean.Recipient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipientDao extends JpaRepository<Recipient,Long> {
    Recipient findByRef (String ref);
    Recipient deleteByRef(String ref);
    List<Recipient> findByRefLikeAndTotalGreaterThan(String ref, double total);


}
