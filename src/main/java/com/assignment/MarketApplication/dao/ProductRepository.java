package com.assignment.MarketApplication.dao;

import com.assignment.MarketApplication.dto.product.ProductGridDTO;
import com.assignment.MarketApplication.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    @Query("""
            SELECT new com.assignment.MarketApplication.dto.product.ProductGridDTO(
            pro.productCode, 
            pro.name, 
            pro.price, 
            pro.currency, 
            pro.discount, 
            pro.dimension, 
            pro.unit)
            FROM Product AS pro
            WHERE pro.name LIKE %:name
            """)
    public Page<ProductGridDTO> getAllProduct(@Param("name") String name, Pageable pageable);
}
