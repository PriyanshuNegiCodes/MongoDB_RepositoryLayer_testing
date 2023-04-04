package com.example.Customer.Controller;

import com.example.Customer.Domain.Customer;
import com.example.Customer.Services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer/v1")
public class CustomerController {
    ICustomerService iCustomerService;

    @Autowired
    public CustomerController(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<?> addCustomer(@RequestBody  Customer customer){
        return new ResponseEntity<>(iCustomerService.addCustomer(customer), HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable int id){
        return new ResponseEntity<>(iCustomerService.deleteCustomer(id), HttpStatus.OK);
    }
    @GetMapping("/getCustomer")
    public ResponseEntity<?> getCustomer(){
        return new ResponseEntity<>(iCustomerService.getCustomer(), HttpStatus.OK);
    }
    @GetMapping("/getSamsung/{productName}")
    public ResponseEntity<?> getProductName(@PathVariable String productName){
        return new ResponseEntity<>(iCustomerService.getProductName(productName), HttpStatus.OK);
    }

    @GetMapping("/getSamsungData")
    public ResponseEntity<?> getSamsung(){
        return new ResponseEntity<>(iCustomerService.getSamsung(), HttpStatus.OK);
    }
}
