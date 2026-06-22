package com.student.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.entity.Student;
import com.student.demo.service.StudentService;

@RestController
public class StudentController {
	
	StudentService studService;
	public StudentController(StudentService studService) {
		super();
		this.studService = studService;
	}
	
	
	@PostMapping("/create")
//	use @PostMapping annotation for create.
	public String create(@RequestBody Student st) {
//		@RequestBody -> Read the request body,
//		Convert it into a Java object Pass that object to your controller method
		studService.createStudent(st);
		return "Student is saved";
	}
	
	
	@GetMapping("/get/{roll}")
	public Student get(@PathVariable("roll") int roll) {
		Student st = studService.getStudent(roll);
		return st;
	}
	@GetMapping("/getmail/{email}")
	public Student getStudentByEmail(@PathVariable("email") String email) {
		Student st = studService.getStudentByEmail(email);
		return st;
	}
	
	@GetMapping("/getall")
	public List<Student> getAll() {
		return studService.getAllStudents();
	}
	
	
	@PutMapping("/update/{roll}")
	public String update(@PathVariable("roll") int roll, @RequestBody Student st) {
//		for create and update, use @RequestBody annotation
		st.setRoll(roll);
		studService.updateStudent(st);
		return "Student is updated";
	}
	
	@DeleteMapping("/delete/{roll}")
	public String delete(@PathVariable("roll") int roll) {
		studService.deleteStudent(roll);
		return "Student is deleted";
	}
}
