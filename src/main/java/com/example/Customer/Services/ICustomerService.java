package com.example.Customer.Services;

import com.example.Customer.Domain.Customer;

import java.util.List;

public interface ICustomerService {
    Customer addCustomer(Customer customer);
    boolean deleteCustomer(int id);
    List<Customer> getCustomer();
    List<Customer> getProductName(String productName);
    List<Customer> getSamsung();
}
