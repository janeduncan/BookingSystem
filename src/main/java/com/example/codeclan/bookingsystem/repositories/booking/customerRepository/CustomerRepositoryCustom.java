package com.example.codeclan.bookingsystem.repositories.booking.customerRepository;
import com.example.codeclan.bookingsystem.models.Customer;
import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersForCourse(Long courseId);
    List<Customer> getCustomerTownCourse(String town, Long courseId);
    List<Customer> getAgeCustomerTownCourse(int age, String town, Long courseId);

}
