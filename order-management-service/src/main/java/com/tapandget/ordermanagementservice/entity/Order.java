package com.tapandget.ordermanagementservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="ORDERS")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

}
