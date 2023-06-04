package ma.sir.obs.service.facade;


import ma.sir.obs.bean.Fournisseur;

import java.util.List;

public interface FournisseurService {

    int save(Fournisseur fournisseur);

    int update(Fournisseur fournisseur);

    Fournisseur findByReference(String reference);

    int deleteByReference(String reference);


    List<Fournisseur> findAll();

}

