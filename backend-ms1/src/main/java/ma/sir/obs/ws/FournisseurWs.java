package ma.sir.obs.ws;


import ma.sir.obs.bean.Supplier;
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
    public int save(@RequestBody Supplier supplier) {

        return fournisseurService.save(supplier);
    }

    @PutMapping("/")
    public int update(@RequestBody Supplier supplier) {

        return fournisseurService.update(supplier);
    }

    @GetMapping("ref/{reference}")
    public Supplier findByReference(@PathVariable String reference) {
        return fournisseurService.findByReference(reference);
    }
   @DeleteMapping("ref/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return fournisseurService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Supplier> findAll() {
        return fournisseurService.findAll();
    }
}
