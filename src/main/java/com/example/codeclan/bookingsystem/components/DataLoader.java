package com.example.codeclan.bookingsystem.components;

import com.example.codeclan.bookingsystem.models.Booking;
import com.example.codeclan.bookingsystem.models.Course;
import com.example.codeclan.bookingsystem.models.Customer;
import com.example.codeclan.bookingsystem.repositories.booking.bookingRepository.BookingRepository;
import com.example.codeclan.bookingsystem.repositories.booking.courseRepository.CourseRepository;
import com.example.codeclan.bookingsystem.repositories.booking.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Jane", "Glasgow", 30);
        customerRepository.save(customer1);

        Course course1 = new Course("Software Development", "Glasgow", 3);
        courseRepository.save(course1);

        Booking booking1 = new Booking("25/05/2018", course1, customer1);
        bookingRepository.save(booking1);

    }
}
