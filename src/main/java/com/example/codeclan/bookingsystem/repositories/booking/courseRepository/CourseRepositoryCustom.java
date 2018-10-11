package com.example.codeclan.bookingsystem.repositories.booking.courseRepository;
import com.example.codeclan.bookingsystem.models.Course;
import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getAllCoursesByRating(int rating);

    List<Course> getAllCoursesForCustomer(Long customerId);
}
