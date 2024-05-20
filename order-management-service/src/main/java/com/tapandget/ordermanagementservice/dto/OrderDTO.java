package com.tapandget.ordermanagementservice.dto;

import java.math.BigDecimal;
public class OrderDTO {

    private BigDecimal id;
    private int quantity;
    private String status;
    private String statusDescription;
    private String codeProduct;
    private String shortDescriptionProduct;
    private String portWMSInUse;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getShortDescriptionProduct() {
        return shortDescriptionProduct;
    }

    public void setShortDescriptionProduct(String shortDescriptionProduct) {
        this.shortDescriptionProduct = shortDescriptionProduct;
    }

    public String getPortWMSInUse() {
        return portWMSInUse;
    }

    public void setPortWMSInUse(String portWMSInUse) {
        this.portWMSInUse = portWMSInUse;
    }
}
