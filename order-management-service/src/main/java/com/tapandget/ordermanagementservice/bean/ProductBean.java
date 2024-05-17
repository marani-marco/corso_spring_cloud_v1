package com.tapandget.ordermanagementservice.bean;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductBean {

    private BigDecimal id;
    private BigDecimal categoryId;
    private String code;
    private String shortDescription;
    private String description;
    private int numberAvailability;
    private String status;

}
