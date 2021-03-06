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

    @GetMapping(value = "/town/{town}/course/{courseId}")
    public List<Customer> getCustomerTownCourse(@PathVariable String town, @PathVariable Long courseId) {
        return customerRepository.getCustomerTownCourse(town, courseId);
    }

    @GetMapping(value = "/age/{age}/town/{town}/course/{courseId}")
    public List<Customer> getAgeCustomerTownCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long courseId) {
        return customerRepository.getAgeCustomerTownCourse(age, town, courseId);
    }

}
