package ma.sir.obs.bean;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class OrderSupplierDeliveryProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    @ManyToOne
    private OrderSupplierDelivery orderSupplierDelivery;

    private BigDecimal qantity;
    private String description;

    public OrderSupplierDelivery getOrderSupplierDelivery() {
        return orderSupplierDelivery;
    }

    public void setOrderSupplierDelivery(OrderSupplierDelivery orderSupplierDelivery) {
        this.orderSupplierDelivery = orderSupplierDelivery;
    }

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

    public BigDecimal getQantity() {
        return qantity;
    }

    public void setQantity(BigDecimal qantity) {
        this.qantity = qantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
