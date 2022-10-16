package com.assignment.MarketApplication.dto.transaction;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class RequestTransactionDTO {
    private String documentCode;
    private String userId;
    private Double total;
    private LocalDate date;
    private String documentNumberId;
    private String documentCodeId;
    private String productCodeId;
    private Double price;
    private Integer quantity;
    private String unit;
    private Double subTotal;
    private String currency;
}
