package ma.sir.obs.service.impl;

import ma.sir.obs.bean.Achat;
import ma.sir.obs.bean.Fournisseur;
import ma.sir.obs.dao.AchatDao;
import ma.sir.obs.service.facade.AchatService;
import ma.sir.obs.service.facade.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AchatServiceImpl implements AchatService {

    @Autowired
    private AchatDao achatDao;
    @Autowired
    private FournisseurService fournisseurService;

    @Override
    public int save(Achat achat){
        if (findByReference(achat.getReference()) != null) {
            return -1;
        } else if (achat.getFournisseur() == null) {
            return -2;
        }

        achatDao.save(achat);
        return 1;
    }

    @Override
    public Achat findByReference(String reference) {
        return achatDao.findByReference(reference);
    }
    @Override
    @Transactional
    public int deleteByReference(String reference) {
        if (findByReference(reference) == null) {
            return -1;
        }
        return achatDao.deleteByReference(reference);
    }

    @Override
    @Transactional
    public int deleteByFournisseurReference(String reference) {
        Fournisseur fournisseur = fournisseurService.findByReference(reference);
        List<Achat> achats = achatDao.findByFournisseur(fournisseur);
        if (achats.isEmpty()){
            return  -1;
        }else {
            for (Achat achat : achats) {

                deleteByReference(achat.getReference());
            }
            return achats.size();
        }
    }

    @Override
    public List<Achat> findByMontantAchatLessThan(double montantAchat) {
        return achatDao.findByMontantAchatLessThan(montantAchat);
    }

    @Override
    public List<Achat> findByMontantAchatGreaterThan(double montantAchat) {
        return  achatDao.findByMontantAchatGreaterThan(montantAchat);
    }

    @Override
    public List<Achat> findAll() {
        return achatDao.findAll();
    }

    @Override
    public int update(Achat achat) {

        if (findByReference(achat.getReference()) == null) {
            return -1;
        }
          achatDao.save(achat);
            return 1;

    }


}
