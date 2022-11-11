package com.scg.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.repository.StudentRepository;
import com.scg.training.service.StudentService;

//@Component
//@Controller
//@RequestMapping("test1")
@RestController
public class StudentController1 {
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentRepository studentRepo;

//	@PostMapping("/createstudent")
//	@ResponseBody
//	public String insert(@RequestBody final StudentVO studentVO) throws InvalidInputException, Exception {
//		// TODO Auto-generated method stub

//		System.out.println(s1.getClass());
//		System.out.println(a1);
	// System.out.println(nicknames);
//		System.out.println("hii");
//		return studentService.insert(studentVO);
//		// return null;
//	}

//	@GetMapping("/student/{id}")
//	public ResponseEntity<String> getById(@PathVariable final int id) throws Exception {
//
//		final Optional<String> user = Optional.ofNullable(studentService.readById(id));
//		if (user.isPresent()) {
//			return new ResponseEntity<>(user.get(), HttpStatus.OK);
//		}
//		throw new InvalidInputException("Id not found");
//
//	}

//	@GetMapping("/student/{id}")
//	public ResponseEntity<String> getById(@PathVariable final int id) throws Exception {
//		final Student readbystudent = studentRepo.getById(id);
//		System.err.println(readbystudent.getStudentName());
//		final List<Laptop> lap = readbystudent.getLaptop();
//		for (final Laptop l : lap) {
//			System.out.println(l.getLaptopName());
//		}
//		final Optional<String> user = Optional.ofNullable(studentService.readById(id));
//		if (user.isPresent()) {
//			return new ResponseEntity<>(user.get(), HttpStatus.OK);
//		}
//		throw new InvalidInputException("Id not found");
//
//	}

//	@GetMapping("/student/{studentname}")
//	public String getByName(@PathVariable final String studentname) {
//
//		final List<Student> studentlist = studentRepo.findStudentByName(studentname);
//		for (final Student s : studentlist) {
//			System.out.println("\nstudent id:" + s.getStudentid());
//			System.out.println("student name:" + s.getName());
//			System.out.println("Gender" + s.getGender());
//		}
//		return "hii";
//
//	}

//	@PutMapping("/updatestudent/{id}")
//	public String update(@RequestBody final StudentVO studentVO) throws Exception {
//		System.out.println(studentVO.getAge());
//		return studentService.update(studentVO);
//
//	}

}

//Spring Controller annotation is typically used in combination with annotated handler methods based on the @RequestMapping annotation.
//It can be applied to classes only. It's used to mark a class as a web request handler

//controller is responsible for handling all incoming client requests and delegate to the appropriate service methods
//@RestControllerAdvice is more convenient annotation for handling Exception with RestfulApi.
// @ControllerAdvice annotation for handling exceptions in the RESTful Services but we need to add @ResponseBody separately.
//@ControllerAdvice handles exceptions globally
//it allow you to use same exception handler for multiple controllers.
//ResponseEntityExceptionHandler
//@ResponseBody: It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

//@Component: It is a class-level annotation. It is used to mark a Java class as a bean. A Java class annotated with @Component is found during the classpath.
//The Spring Framework pick it up and configure it in the application context as a Spring Bean.

//@RequestMapping: It is used to map the web requests. It has many optional elements like consumes, header, method, name,
//params, path, produces, and value. We use it with the class as well as the method.
