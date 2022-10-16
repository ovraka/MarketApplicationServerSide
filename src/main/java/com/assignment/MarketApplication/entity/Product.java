package com.assignment.MarketApplication.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "ProductCode", nullable = false)
    private String productCode;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Price", nullable = false)
    private Double price;

    @Column(name = "Currency", nullable = false)
    private String currency;

    @Column(name = "Discount")
    private Double discount;

    @Column(name = "Dimension", nullable = false)
    private String dimension;

    @Column(name = "Unit", nullable = false)
    private String unit;

}
