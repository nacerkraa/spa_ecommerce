package com.webspa.app.services;

import com.webspa.app.dtos.ProductDto;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    private final List<ProductDto> products = Arrays.asList(
            new ProductDto(1L, "Iphone13", 124.25, 25, "phones"),
            new ProductDto(2L, "Iphone15", 124.25, 25, "phones")
            );
    public List<ProductDto> allProducts() {
        return products;
    }
}
