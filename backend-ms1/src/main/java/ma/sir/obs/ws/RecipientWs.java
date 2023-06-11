package ma.sir.obs.ws;


import ma.sir.obs.bean.Recipient;
import ma.sir.obs.service.facade.RecipientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recipient")
public class RecipientWs {


    @PostMapping("/")
    public int save(@RequestBody Recipient recipient) {
        return recipientService.save(recipient);
    }

    @PutMapping("/")
    public int update(@RequestBody Recipient recipient) {
        return recipientService.save(recipient);
    }


    @GetMapping("/reference/{reference}")
    public Recipient findByCode(@PathVariable String code) {
        return recipientService.findByCode(code);
    }

    @DeleteMapping("/reference/{reference")
    public int deleteByReference(@PathVariable String code) {
        return recipientService.deleteByCode(code);
    }



    @GetMapping("/")
    public List<Recipient> findAll() {
        return recipientService.findAll();
    }

    @Autowired
    private RecipientService recipientService;
}
