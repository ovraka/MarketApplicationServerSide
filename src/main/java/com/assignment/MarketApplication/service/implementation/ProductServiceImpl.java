package com.assignment.MarketApplication.service.implementation;

import com.assignment.MarketApplication.dao.ProductRepository;
import com.assignment.MarketApplication.dto.product.ProductGridDTO;
import com.assignment.MarketApplication.service.abstarction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    private final int rowsInPage = 10;

    @Override
    public Page<ProductGridDTO> getProductGrid(Integer page, String name) {
        var pagination = PageRequest.of(page -1, rowsInPage, Sort.by("name"));
        var pageObject = productRepository.getAllProduct(name, pagination);

        return pageObject;
    }
}
