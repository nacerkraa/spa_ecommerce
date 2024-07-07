package com.webspa.app.controllers;

import com.webspa.app.dtos.ProductDto;
import com.webspa.app.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> allProducts() {
        return ResponseEntity.ok(productService.allProducts());
    }
}
