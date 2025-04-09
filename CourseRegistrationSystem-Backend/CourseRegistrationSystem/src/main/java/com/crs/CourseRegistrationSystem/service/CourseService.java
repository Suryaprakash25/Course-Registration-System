package com.crs.CourseRegistrationSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crs.CourseRegistrationSystem.entity.Course;
import com.crs.CourseRegistrationSystem.entity.CourseRegistry;
import com.crs.CourseRegistrationSystem.repository.CourseRegistryRepo;
import com.crs.CourseRegistrationSystem.repository.CourseRepo;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}