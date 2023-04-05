package com.example.Customer.Domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Document
@EqualsAndHashCode
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private long customerPhoneNo;
    private Product customerProduct;
}
