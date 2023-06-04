package ma.sir.obs.dao;

import ma.sir.obs.bean.Achat;
import ma.sir.obs.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AchatDao extends JpaRepository <Achat, Long> {
    Achat findByReference(String reference);
    int deleteByReference(String reference);

    int deleteByFournisseurReference(String reference);
    List<Achat> findByMontantAchatLessThan(double montantAchat);

    List<Achat> findByMontantAchatGreaterThan(double montantAchat);

    List<Achat> findByFournisseur(Fournisseur fournisseur);


}
