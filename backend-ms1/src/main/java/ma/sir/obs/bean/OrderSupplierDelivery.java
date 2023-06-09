package ma.sir.obs.bean;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class OrderSupplierDelivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private OrderSupplier orderSupplier;
    @ManyToOne
    private OrderSupplierStatus orderSupplierStatus;
    @ManyToOne
    private Purchaser purchaser;

    private BigDecimal total;
    private String description;
    private LocalDateTime dateDelivery;
    private LocalDateTime invoiceAck;
    private String invoiceAckNumber;
    private String invoicePrNumber;
    private LocalDateTime invoiceDate;
    private LocalDateTime invoiceAckDelivery;
    private String descriptionInvoice;
    private String invoiceNumber;
    @ManyToOne
    private OrderSupplierDeliveryStatus orderSupplierDeliveryStatus;

    public LocalDateTime getInvoiceAck() {
        return invoiceAck;
    }

    public void setInvoiceAck(LocalDateTime invoiceAck) {
        this.invoiceAck = invoiceAck;
    }

    public String getInvoiceAckNumber() {
        return invoiceAckNumber;
    }

    public void setInvoiceAckNumber(String invoiceAckNumber) {
        this.invoiceAckNumber = invoiceAckNumber;
    }

    public String getInvoicePrNumber() {
        return invoicePrNumber;
    }

    public void setInvoicePrNumber(String invoicePrNumber) {
        this.invoicePrNumber = invoicePrNumber;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getInvoiceAckDelivery() {
        return invoiceAckDelivery;
    }

    public void setInvoiceAckDelivery(LocalDateTime invoiceAckDelivery) {
        this.invoiceAckDelivery = invoiceAckDelivery;
    }

    public String getDescriptionInvoice() {
        return descriptionInvoice;
    }

    public void setDescriptionInvoice(String descriptionInvoice) {
        this.descriptionInvoice = descriptionInvoice;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public OrderSupplierDeliveryStatus getOrderSupplierDeliveryStatus() {
        return orderSupplierDeliveryStatus;
    }

    public void setOrderSupplierDeliveryStatus(OrderSupplierDeliveryStatus orderSupplierDeliveryStatus) {
        this.orderSupplierDeliveryStatus = orderSupplierDeliveryStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderSupplier getOrderSupplier() {
        return orderSupplier;
    }

    public void setOrderSupplier(OrderSupplier orderSupplier) {
        this.orderSupplier = orderSupplier;
    }

    public OrderSupplierStatus getOrderSupplierStatus() {
        return orderSupplierStatus;
    }

    public void setOrderSupplierStatus(OrderSupplierStatus orderSupplierStatus) {
        this.orderSupplierStatus = orderSupplierStatus;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Purchaser purchaser) {
        this.purchaser = purchaser;
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

    public LocalDateTime getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDateTime dateDelivery) {
        this.dateDelivery = dateDelivery;
    }
}
