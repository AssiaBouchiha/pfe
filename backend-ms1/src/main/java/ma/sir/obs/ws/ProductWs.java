package ma.sir.obs.ws;

import ma.sir.obs.bean.Product;
import ma.sir.obs.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductWs {

    @PostMapping("/")
    public int save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("partNumber/{partNumber}")
    public Product findBypartNumber(@PathVariable String partNumber) {
        return productService.findBypartNumber(partNumber);
    }

    @GetMapping("/")
    public List findAll() {
        return productService.findAll();
    }

    @Autowired
    private ProductService productService;
}
