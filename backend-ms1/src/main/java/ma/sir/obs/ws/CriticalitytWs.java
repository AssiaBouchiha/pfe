package ma.sir.obs.ws;


import ma.sir.obs.bean.Achat;
import ma.sir.obs.service.facade.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/criticality")
public class CriticalitytWs {

    @PostMapping("/")
    public int save(@RequestBody Achat achat) {
        return achatService.save(achat);
    }

    @PutMapping("/")
    public int update(@RequestBody Achat achat) {
        return achatService.update(achat);
    }


    @GetMapping("/code/{code}")
    public Achat findByReference(@PathVariable String code) {
        return achatService.findByReference(code);
    }

    @DeleteMapping("/code/{code")
    public int deleteByReference(@PathVariable String code) {
        return achatService.deleteByReference(code);
    }

    @GetMapping("/MontantAchatGreaterThan/{montantAchat}")
    public List<Achat> findByMontantAchatGreaterThan(@PathVariable double montantAchat) {
        return achatService.findByMontantAchatGreaterThan(montantAchat);
    }

    @GetMapping("/")
    public List<Achat> findAll() {
        return achatService.findAll();
    }

    @Autowired
    private AchatService achatService;
}
