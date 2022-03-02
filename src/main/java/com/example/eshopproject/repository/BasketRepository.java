package com.example.eshopproject.repository;

import com.example.eshopproject.model.Basket;
import com.example.eshopproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {


}
