package com.scg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.entity.Student;
import com.scg.training.exception.InvalidInputException;
import com.scg.training.service.StudentService;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentService studentService;
//	@Autowired
//	private StudentRepository studentRepository;

	@PostMapping
	public Student saveStudent(@RequestBody final Student student) throws InvalidInputException, Exception {
		return studentService.saveStudent(student);
	}

	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();

	}

	@GetMapping("/{studentName}")
	public List<Student> getStudentByName(@PathVariable final String studentName) {

		return studentService.getStudentByName(studentName);

	}

//	@GetMapping("/studentid/{id}")
//	public List<String> getSchoolByStudentById(@PathVariable final int id) {
//		return studentRepository.getSchoolByStudentById(id);
//
//	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable final int id) {
		return studentService.deleteStudent(id);

	}
}
