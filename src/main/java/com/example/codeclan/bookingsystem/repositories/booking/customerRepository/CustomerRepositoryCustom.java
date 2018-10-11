package com.example.codeclan.bookingsystem.repositories.booking.customerRepository;
import com.example.codeclan.bookingsystem.models.Customer;
import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getAllCustomersForCourse(Long courseId);

}
