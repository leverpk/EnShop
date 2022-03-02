package com.example.eshopproject.service;

import com.example.eshopproject.model.Basket;
import com.example.eshopproject.model.Customer;
import com.example.eshopproject.model.Product;
import com.example.eshopproject.repository.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JpaBasketService implements BasketService{

    private final ProductService productService;
    private final BasketRepository basketRepository;



}
