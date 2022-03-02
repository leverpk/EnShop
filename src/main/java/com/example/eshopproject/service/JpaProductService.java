package com.example.eshopproject.service;

import com.example.eshopproject.model.Category;
import com.example.eshopproject.model.Product;
import com.example.eshopproject.repository.CategoryRepository;
import com.example.eshopproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JpaProductService implements ProductService{

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllProductsInCategory(Long id) {
        return categoryRepository.findById(id).map(Category::getProductsList).orElseThrow();
    }

    @Override
    public Product getByProductId(Long id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> findAllProductsContainsPhrase(String phrase) {
        return productRepository.findProductsByProductNameContains(phrase);
    }

}
