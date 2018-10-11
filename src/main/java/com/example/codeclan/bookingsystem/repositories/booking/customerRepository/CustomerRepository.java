package com.example.codeclan.bookingsystem.repositories.booking.customerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRepository, Long>, CustomerRepositoryCustom {
}
