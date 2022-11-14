package com.scg.training.service;

import java.util.List;

import com.scg.training.entity.Student;
import com.scg.training.exception.InvalidInputException;

//@Service
//@Component
public interface StudentService {

	Student saveStudent(Student student) throws Exception, InvalidInputException;

	List<Student> getStudents();

	List<Student> getStudentByName(String studentName);

	String deleteStudent(int id);

}

//Field studentService in com.scg.training.controller.StudentController required a bean of type 'com.scg.training.service.StudentService' that could not be found.
