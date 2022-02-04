package com.example.eshopproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@DynamicUpdate
public class Order implements Serializable {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    private Set<ProductInOrder> products = new HashSet<>();

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
    @NotNull
    @ColumnDefault("0")
    private Integer orderStatus;

    public Order(Customer buyer){
        this.buyerFirstName = buyer.getEmail();
        this.buyerLastName = buyer.getLastName();
        this.buyerEmail = buyer.getEmail();
        this.buyerPhone = buyer.getPhone();
        this.buyerAddress = buyer.getAddress();
        this.orderAmount = buyer.getBasket().getProducts().stream()
                .map(item -> item.getProductPrice()
                        .multiply(new BigDecimal(item.getCount())))
                .reduce(BigDecimal::add).orElse(new BigDecimal(0));
        this.orderStatus = 0;


    }

}
