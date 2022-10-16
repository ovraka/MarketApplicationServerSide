package com.assignment.MarketApplication.dto.product;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;

@Schema(description = "Data yang akan ditunjukan di product grid di halaman product")
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class ProductGridDTO {
    @Schema(description = "Product PK")
    private String productCode;

    @Schema(description = "Nama product, nama product tidak bersifat unik")
    private String name;

    @Schema(description = "Harga product")
    private Double price;

    @Schema(description = "Tipe currency product")
    private String currency;

    @Schema(description = "Discount product dalam persen")
    private Double discount;

    @Schema(description = "Besar dimensi product")
    private String dimension;

    @Schema(description = "Satuan product")
    private String unit;
}
