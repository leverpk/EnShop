package com.example.eshopproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;

}
