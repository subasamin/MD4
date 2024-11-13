package com.example.testmodule4.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "Order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Date datePrice;

    @NotNull
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

}
