package com.scg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.repository.StudentRepository;
import com.scg.training.service.StudentService;
import com.scg.training.vo.StudentVO;

@RestController
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping
	public StudentVO saveStudet(@RequestBody final StudentVO employeeVo) {
		return studentService.saveStudent(employeeVo);

	}

	@GetMapping
	public List<StudentVO> getStudents() {
		return studentService.getStudents();

	}

	@GetMapping("/page/{pageNumber}")
	public List<StudentVO> getStudentsByPagination(@PathVariable final int pageNumber) {

		return studentService.getStudentsByPagination(pageNumber);

	}

	@GetMapping("/id")
	public StudentVO getStudentById(@RequestParam final int id) {
		return studentService.getStudentById(id);

	}

	@GetMapping("/student/{id}")
	public List<String> getSchoolByStudentById(@PathVariable final int id) {
		return studentRepository.getSchoolByStudentById(id);

	}

	@GetMapping("/name/{name}")
	public List<StudentVO> findByName(@PathVariable final String name) {
		return studentService.findByStudentName(name);
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable final int id) {
		return studentService.deleteStudent(id);

	}

	@PutMapping
	public StudentVO updateStudentById(@RequestBody final StudentVO studentVO) {
		return studentService.updateStudentById(studentVO);
	}
}
