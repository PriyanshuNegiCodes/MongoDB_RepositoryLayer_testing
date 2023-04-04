package com.example.Customer.Services;

import com.example.Customer.Domain.Customer;
import com.example.Customer.Exception.CustomerAlreadyExistException;
import com.example.Customer.Exception.CustomerNotFoundExceptoin;

import java.util.List;

public interface ICustomerService {
    Customer addCustomer(Customer customer) throws CustomerAlreadyExistException;
    boolean deleteCustomer(int id) throws CustomerNotFoundExceptoin;
    List<Customer> getCustomer() ;
    List<Customer> getProductName(String productName);
    List<Customer> getSamsung();
}
