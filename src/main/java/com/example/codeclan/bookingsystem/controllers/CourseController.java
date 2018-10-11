package com.example.codeclan.bookingsystem.controllers;

import com.example.codeclan.bookingsystem.models.Course;
import com.example.codeclan.bookingsystem.repositories.booking.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getAllCoursesByRating(@PathVariable int rating) {
        return courseRepository.getAllCoursesByRating(rating);
    }
}
