package com.tapandget.warehousemanagementservice.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="PRODUCTS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name="CATEGORY_ID")
    private BigDecimal categoryId;

    private String code;

    @Column(name ="SHORT_DESCRIPTION")
    private String shortDescription;

    private String description;

    @Column(name= "NUMBER_AVAILABILITY")
    private int numberAvailability;

    private String status;

    public Product() {
    }

    @Transient
    private String port;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(BigDecimal categoryId) {
        this.categoryId = categoryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberAvailability() {
        return numberAvailability;
    }

    public void setNumberAvailability(int numberAvailability) {
        this.numberAvailability = numberAvailability;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
