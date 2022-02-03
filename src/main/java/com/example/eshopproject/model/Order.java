package com.example.eshopproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Order {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String buyerFirstName;
    @NotEmpty
    private String buyerLastName;
    @NotEmpty
    private String buyerEmail;
    @NotEmpty
    private String buyerPhone;
    @NotEmpty
    private String buyerAddress;
    @NotNull
    private BigDecimal orderAmount;

}
