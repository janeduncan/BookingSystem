package com.example.codeclan.bookingsystem.controllers;

import com.example.codeclan.bookingsystem.models.Customer;
import com.example.codeclan.bookingsystem.repositories.booking.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{courseId}")
    public List<Customer> getAllCustomersForCourse(@PathVariable Long courseId) {
        return customerRepository.getAllCustomersForCourse(courseId);
    }
}
