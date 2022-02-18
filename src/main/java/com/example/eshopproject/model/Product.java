package com.example.eshopproject.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Entity
@Builder
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    @NotNull
    private String productName;
    @NotNull
    private BigDecimal productPrice;
    @NotNull
    private Integer productStock;
    @NotNull
    private String productDescription;
    @NotNull
    private Long categoryType;

}
