package ma.sir.obs.ws;


import ma.sir.obs.bean.Fournisseur;
import ma.sir.obs.service.facade.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/fournisseur")
public class FournisseurWs {
    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping("/")
    public int save(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.save(fournisseur);
    }

    @PutMapping("/")
    public int update(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.update(fournisseur);
    }

    @GetMapping("ref/{reference}")
    public Fournisseur findByReference(@PathVariable String reference) {
        return fournisseurService.findByReference(reference);
    }
   @DeleteMapping("ref/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return fournisseurService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Fournisseur> findAll() {
        return fournisseurService.findAll();
    }
}
