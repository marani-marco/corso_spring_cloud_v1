package com.tapandget.ordermanagementservice.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
public class OrderDTO {

    private BigDecimal id;
    private int quantity;
    private String status;
    private String statusDescription;
    private String codeProduct;
    private String shortDescriptionProduct;


}
