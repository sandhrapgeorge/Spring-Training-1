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
//		final StudentDetails studentDetails = new StudentDetails("dance", Double.valueOf(15.5d));
//		final School school1 = new School();
//		school1.setSchoolName("mar basil");
//		school1.setCity("kothamangalam");
//		final Student student1 = new Student();
//		student1.setStudentName("janu");
//		final Gender gender = Gender.FEMALE;
//		student1.setGender(gender);
//		final Laptop laptop1 = new Laptop("DELL");
//		final Laptop laptop2 = new Laptop("Lenovo");
//		final List<Laptop> l1 = Arrays.asList(laptop1, laptop2);
//		student1.setLaptop(l1);
//		student1.setSchool(school1);
//		student1.setStudentDetails(studentDetails);
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
