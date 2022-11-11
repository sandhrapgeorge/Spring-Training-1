package com.scg.training.advise;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.scg.training.exception.InvalidInputException;

//@ControllerAdvice
@RestControllerAdvice
public class StudentControllerAdvise extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InvalidInputException.class)
	// @ResponseBody
	public String handleAnyTypeException(final InvalidInputException elementException) {
		return elementException.getMessage();
	}

}
