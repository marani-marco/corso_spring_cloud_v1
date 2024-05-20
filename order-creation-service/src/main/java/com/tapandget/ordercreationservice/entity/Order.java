package com.tapandget.ordercreationservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name="PRODUCT_ID")
    private BigDecimal productId;

    private int quantity;

    private LocalDateTime dateCreation;

    private LocalDateTime dateUpdate;

    private String status;

    private String statusDescription;

    @Column(name="CUSTOMER_ID")
    private BigDecimal customerId;

    @Column(name="USER_ID_LAST_UPDATE")
    private BigDecimal userIdLastUpdate;

    public Order() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getProductId() {
        return productId;
    }

    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public BigDecimal getCustomerId() {
        return customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getUserIdLastUpdate() {
        return userIdLastUpdate;
    }

    public void setUserIdLastUpdate(BigDecimal userIdLastUpdate) {
        this.userIdLastUpdate = userIdLastUpdate;
    }
}
