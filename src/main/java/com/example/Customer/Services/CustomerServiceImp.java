package com.example.Customer.Services;

import com.example.Customer.Domain.Customer;
import com.example.Customer.Repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements ICustomerService{
    ICustomerRepository iCustomerRepository;

    @Autowired
    public CustomerServiceImp(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(int id) {
        iCustomerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Customer> getCustomer() {
        return iCustomerRepository.findAll();
    }

    @Override
    public List<Customer> getProductName(String productName) {
        return iCustomerRepository.getProductName(productName);
    }

    @Override
    public List<Customer> getSamsung() {
        return iCustomerRepository.getSamsungProduct();
    }
}
