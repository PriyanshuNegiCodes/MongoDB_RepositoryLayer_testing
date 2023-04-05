package com.example.Customer.Domain;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@EqualsAndHashCode
public class Product {
    private int productId;
    private String productName;
    private String productDescription;
}
