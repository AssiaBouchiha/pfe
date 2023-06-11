package ma.sir.obs.ws;

import ma.sir.obs.bean.ProductFamily;
import ma.sir.obs.service.facade.ProductFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productFamily")
public class ProductFamilyWs {

    @PostMapping("/")
    public int save(@RequestBody ProductFamily productFamily) {
        return productFamilyService.save(productFamily);
    }

    @GetMapping("code/{code}")
    public ProductFamily findBypartNumber(@PathVariable String code) {
        return productFamilyService.findByCode(code);
    }

    @GetMapping("/")
    public List findAll() {
        return productFamilyService.findAll();
    }

    @Autowired
    private ProductFamilyService productFamilyService;
}
