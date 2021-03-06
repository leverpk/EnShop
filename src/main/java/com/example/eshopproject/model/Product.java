package com.example.eshopproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    @NotNull
    private String productName;
    @NotNull
    private BigDecimal productPrice;
    @NotNull
    private Integer productStock;

    private String productIcon;
    @NotNull
    private String productDescription;

}
