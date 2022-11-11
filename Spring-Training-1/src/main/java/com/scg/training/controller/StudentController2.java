package com.scg.training.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testing/api/foos")
public class StudentController2 {

//	@GetMapping("testing/api/foos")
//	public String getFoos(@RequestParam final String id) {
//		return "ID: " + id;
//	}

	@PostMapping
	public String addFoo(@RequestParam(name = "id") final String fooId, @RequestParam final String name) {
		return "ID: " + fooId + " Name: " + name;
	}
//
//	@GetMapping("testing/api/foos")
//	public String getFoos1(@RequestParam(required = false) final String id) {
//		return "ID: " + id;
//	}
//
//	@GetMapping("testing/api/foos")
//	public String getFoos(@RequestParam final Optional<String> id) {
//		return "ID: " + id.orElseGet(() -> "not provided");
//	}

	@GetMapping
	public String getFoos(@RequestParam final List<String> id) {
		return "IDs are " + id;
	}
}
//http://localhost:8080/spring-mvc-basics/api/foos?id=abc
