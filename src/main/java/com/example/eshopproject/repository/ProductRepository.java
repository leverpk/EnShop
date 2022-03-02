package com.example.eshopproject.repository;

import com.example.eshopproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductsByProductNameIgnoreCaseContaining(String phrase);

}
