package com.assignment.MarketApplication.service.abstarction;

import com.assignment.MarketApplication.dto.product.ProductGridDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    public Page<ProductGridDTO> getProductGrid(Integer page, String name);

}
