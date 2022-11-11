package com.scg.training.service;

import com.scg.training.exception.InvalidInputException;
import com.scg.training.vo.StudentVO;

//@Service
//@Component
public interface StudentService {
	// String insert() throws Exception, InvalidInputException;

	String insert(StudentVO studentVO) throws Exception, InvalidInputException;

	String readById(int id) throws Exception;

	String update(StudentVO studentVO) throws Exception, InvalidInputException;
}

//Field studentService in com.scg.training.controller.StudentController required a bean of type 'com.scg.training.service.StudentService' that could not be found.
