package com.assignment.MarketApplication.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TransactionHeaders")
public class TransactionHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DocumentNumber", nullable = false)
    private Long documentNumber;

    @Column(name = "DocumentCode")
    private String documentCode;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UserId", insertable = false, updatable = false)
    private User user;

    @Column
    private String userId;

    @Column(name = "Total")
    private Double total;

    @Column(name = "Date")
    private Date date;
}
