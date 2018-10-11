package com.example.codeclan.bookingsystem.repositories.booking.bookingRepository;
import com.example.codeclan.bookingsystem.models.Booking;
import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getAllBookingsForDate(String date);
}
