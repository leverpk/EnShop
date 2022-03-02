package com.example.eshopproject.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Builder
public class ProductDto {

    @NotNull
    private String productName;
    @NotNull
    private BigDecimal productPrice;

    private String productIcon;

}
