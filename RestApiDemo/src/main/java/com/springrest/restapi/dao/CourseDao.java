package com.springrest.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.restapi.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Integer> {


}
