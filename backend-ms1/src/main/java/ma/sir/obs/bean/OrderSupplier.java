package ma.sir.obs.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;

    @ManyToOne
    private OrderSupplierType orderSupplierType;
    private LocalDateTime dateOrder;
    @ManyToOne
    private Criticality criticality;
    @ManyToOne
    private Supplier supplier;
    @ManyToOne
    private Recipient recipient;
    @ManyToOne
    private Purchaser purchaser;

    private BigDecimal total;
    private String description;
    @ManyToOne
    private Currency currency;
    @ManyToOne
    private OrderSupplierStatus orderSupplierStatus;


    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public OrderSupplierStatus getOrderSupplierStatus() {
        return orderSupplierStatus;
    }

    public void setOrderSupplierStatus(OrderSupplierStatus orderSupplierStatus) {
        this.orderSupplierStatus = orderSupplierStatus;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Purchaser purchaser) {
        this.purchaser = purchaser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderSupplierType getOrderSupplierType() {
        return orderSupplierType;
    }

    public void setOrderSupplierType(OrderSupplierType orderSupplierType) {
        this.orderSupplierType = orderSupplierType;
    }

    public LocalDateTime getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDateTime dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Criticality getCriticality() {
        return criticality;
    }

    public void setCriticality(Criticality criticality) {
        this.criticality = criticality;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
