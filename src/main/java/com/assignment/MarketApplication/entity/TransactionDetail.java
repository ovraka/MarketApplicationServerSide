package com.assignment.MarketApplication.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TransactionDetails")
public class TransactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DocumentNumberId", insertable = false, updatable = false)
    private TransactionDetail transactionDetail;

    @Column(name = "DocumentNumberId", nullable = false)
    private String documentNumberId;

    @Column(name = "DocumentCodeId")
    private String documentCodeId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ProductCodeId", insertable = false, updatable = false)
    private Product product;

    @Column(name = "ProductCodeId")
    private String productCodeId;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Quantity", nullable = false)
    private Integer quantity;

    @Column(name = "Unit", nullable = false)
    private String unit;

    @Column(name = "SubTotal", nullable = false)
    private Double subTotal;

    @Column(name = "Currency", nullable = false)
    private String currency;
}
