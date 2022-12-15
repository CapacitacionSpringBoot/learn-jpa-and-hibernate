package com.fam.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fam.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);

	List<Course> findByName(String name);
}
