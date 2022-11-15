package com.scg.training.advise;

import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.scg.training.exception.InvalidInputException;

import lombok.extern.slf4j.Slf4j;

//@ControllerAdvice
@RestControllerAdvice
@Slf4j
public class StudentControllerAdvise extends ResponseEntityExceptionHandler {

	@ExceptionHandler(InvalidInputException.class)
	// @ResponseBody
	public String handleAnyTypeException(final InvalidInputException elementException) {
		return elementException.getMessage();
	}

	@ExceptionHandler(DataAccessException.class)
	// @ResponseBody
	public String handleException(final DataAccessException elementException) {
		return "data access Exception occured";
	}

	@ExceptionHandler(Exception.class)
	// @ResponseBody
	public String handleExceptionAny(final Exception exception) {
		log.info("An Exception occured: " + exception);
		return "An Exception occured";
	}

}
