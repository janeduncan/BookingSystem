package com.example.codeclan.bookingsystem.repositories.booking.courseRepository;

import com.example.codeclan.bookingsystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
