package com.example.Customer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT, reason = "The customer already exist for the given ID")
public class CustomerAlreadyExistException extends Exception{
}
