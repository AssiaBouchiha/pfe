package ma.sir.obs.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderSupplierProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private OrderSupplier orderSupplier;

    private BigDecimal qantity;
    private BigDecimal unitePrice;
    private BigDecimal price;
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderSupplier getOrderSupplier() {
        return orderSupplier;
    }

    public void setOrderSupplier(OrderSupplier orderSupplier) {
        this.orderSupplier = orderSupplier;
    }

    public BigDecimal getQantity() {
        return qantity;
    }

    public void setQantity(BigDecimal qantity) {
        this.qantity = qantity;
    }

    public BigDecimal getUnitePrice() {
        return unitePrice;
    }

    public void setUnitePrice(BigDecimal unitePrice) {
        this.unitePrice = unitePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
