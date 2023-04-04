package com.example.Customer.Services;

import com.example.Customer.Domain.Customer;
import com.example.Customer.Exception.CustomerAlreadyExistException;
import com.example.Customer.Exception.CustomerNotFoundExceptoin;
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
    public Customer addCustomer(Customer customer) throws CustomerAlreadyExistException {
        if(iCustomerRepository.findById(customer.getCustomerId()).isEmpty()){
            return iCustomerRepository.insert(customer);
        }else {
            throw new CustomerAlreadyExistException();
        }
    }

    @Override
    public boolean deleteCustomer(int id) throws CustomerNotFoundExceptoin {
        if(iCustomerRepository.findById(id).isEmpty()){
            throw new  CustomerNotFoundExceptoin();

        }else{
            return true;
        }
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
