package com.example.Customer.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Document
public class Customer {

    @Id
    private int customerId;
    private String customerName;
    private long customerPhoneNo;
    private Product customerProduct;
}
