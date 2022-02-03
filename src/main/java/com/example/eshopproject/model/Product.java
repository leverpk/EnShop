package com.example.eshopproject.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Id
    private Long id;
    @NotNull
    private String productName;
    @NotNull
    private BigDecimal productPrice;
    @NotNull
    private Integer productStock;
    @NotNull
    private String productDescription;

}
