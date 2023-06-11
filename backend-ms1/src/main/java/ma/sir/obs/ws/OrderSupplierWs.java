package ma.sir.obs.ws;


import ma.sir.obs.bean.OrderSupplier;
import ma.sir.obs.service.facade.OrderSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderSupplier")
public class OrderSupplierWs {

    @PostMapping("/")
    public int save(@RequestBody OrderSupplier orderSupplier) {
        return orderSupplierService.save(orderSupplier);
    }

    @PutMapping("/")
    public int update(@RequestBody OrderSupplier orderSupplier) {
        return orderSupplierService.update(orderSupplier);
    }


    @GetMapping("/reference/{reference}")
    public OrderSupplier findByReference(@PathVariable String reference) {
        return orderSupplierService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference")
    public int deleteByReference(@PathVariable String reference) {
        return orderSupplierService.deleteByReference(reference);
    }

    @GetMapping("/")
    public List<OrderSupplier> findAll() {
        return orderSupplierService.findAll();
    }

    @Autowired
    private OrderSupplierService orderSupplierService;
}
