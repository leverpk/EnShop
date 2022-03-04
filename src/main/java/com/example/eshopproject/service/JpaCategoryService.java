package com.example.eshopproject.service;

import com.example.eshopproject.model.Category;
import com.example.eshopproject.model.Customer;
import com.example.eshopproject.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JpaCategoryService implements CategoryService{

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getById(id);
    }
}
