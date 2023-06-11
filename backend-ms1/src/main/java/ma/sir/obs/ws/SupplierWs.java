package ma.sir.obs.ws;


import ma.sir.obs.bean.Supplier;
import ma.sir.obs.service.facade.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/api/supplier")
public class SupplierWs {
    @Autowired
    private SupplierService supplierService;

    @PostMapping("/")
    public int save(@RequestBody Supplier supplier) {

        return supplierService.save(supplier);
    }

    @PutMapping("/")
    public int update(@RequestBody Supplier supplier) {

        return supplierService.update(supplier);
    }

    @GetMapping("ref/{reference}")
    public Supplier findByReference(@PathVariable String reference) {
        return supplierService.findByReference(reference);
    }
   @DeleteMapping("ref/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return supplierService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<Supplier> findAll() {
        return supplierService.findAll();
    }
}
