package com.tapandget.warehousemanagementservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="PRODUCTS")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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


}
