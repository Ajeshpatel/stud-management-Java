package com.student.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.entity.Student;
import com.student.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	StudentRepository studRepo;

	@Autowired // optional here
	public StudentService(StudentRepository studRepo) {
		super();
		this.studRepo = studRepo;
	}
	
	public void createStudent(Student st) {
		studRepo.save(st);
	}
	
	public Student getStudent(int roll) {
//		Optional<Student> st = studRepo.findById(roll);
//		
//		if (st != null) {
//			return (Student)st;
//		}
//		else {
//			return null;
//		}
		
		Student st = studRepo.findById(roll).orElse(null);
		return st;
	}
	
	public Student getStudentByEmail(String email) {
		Student st = studRepo.findByEmail(email);
		return st;
	}
	
	public List<Student> getAllStudents() {
		List<Student> studList = studRepo.findAll();
		return studList;
	}
	
	public void updateStudent(Student st) {
		studRepo.save(st);
	}
	
	public void deleteStudent(int roll) {
		studRepo.deleteById(roll);
	}
}
