package ma.sir.obs.dao;

import ma.sir.obs.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {

    Fournisseur findByReference(String reference);

    int deleteByReference(String reference);

}
