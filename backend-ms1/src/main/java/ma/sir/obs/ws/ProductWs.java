package ma.sir.obs.ws;

import ma.sir.obs.bean.Product;
import ma.sir.obs.service.facade.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductWs {
    public int save(Product product) {
        return productService.save(product);
    }

    @GetMapping("partNumber/{partNumber}")
    public Product findBypartNumber(String partNumber) {
        return productService.findBypartNumber(partNumber);
    }

    public List findAll() {
        return productService.findAll();
    }

    @Autowired
    private ProductService productService;
}
