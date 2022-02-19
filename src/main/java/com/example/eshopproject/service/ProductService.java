package com.example.eshopproject.service;

import com.example.eshopproject.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<Product> findAllProducts();
    List<Product> findAllProductsInCategory(Long id);
}
