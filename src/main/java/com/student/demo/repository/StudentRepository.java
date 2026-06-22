package com.student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

		Student findByEmail(String email);
	
}
