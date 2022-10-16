package com.assignment.MarketApplication.rest;

import com.assignment.MarketApplication.handler_exception.InternalServerError;
import com.assignment.MarketApplication.service.abstarction.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<Object> get(@RequestParam(defaultValue = "") String name,
                                      @RequestParam(defaultValue = "1") Integer page) {
        try {
            var pageObject = productService.getProductGrid(page, name);
            return ResponseEntity.status(HttpStatus.OK).body(pageObject);
        } catch (Exception exception) {
            throw new InternalServerError("There is a run-time error on the server.");
        }
    }
}
