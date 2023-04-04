package com.example.Customer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The id to delete the document was not found")
public class CustomerNotFoundExceptoin extends Exception{
}
