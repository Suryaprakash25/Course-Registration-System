package com.crs.CourseRegistrationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crs.CourseRegistrationSystem.entity.CourseRegistry;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}