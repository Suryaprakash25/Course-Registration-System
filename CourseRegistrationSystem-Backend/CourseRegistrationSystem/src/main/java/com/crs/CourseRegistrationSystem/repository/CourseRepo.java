package com.crs.CourseRegistrationSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crs.CourseRegistrationSystem.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
}
