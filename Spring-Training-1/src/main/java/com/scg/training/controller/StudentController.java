package com.scg.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.service.StudentService;

//@Controller
@RequestMapping("test")
@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("one")
	public String insert() {
		System.out.println(studentService.insert());
		if ((1 == 1) && (2 == 2)) {
			System.out.println("hii");
		}
		return studentService.insert();
	}

	@GetMapping("two")
	public String inserting() {
		System.out.println(studentService.insert());
		return "Two";
	}

}
