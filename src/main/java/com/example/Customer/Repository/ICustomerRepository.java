package com.example.Customer.Repository;

import com.example.Customer.Domain.Customer;
import com.example.Customer.Domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends MongoRepository <Customer, Integer>{

    @Query("{'customerProduct.productName':{$in:[?0]}}")
    List<Customer> getProductName(String productName);

    @Query("{'customerProduct.productName':'Samsung'}")
    List<Customer> getSamsungProduct();
}
