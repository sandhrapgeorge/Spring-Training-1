package com.scg.training.service;

import java.util.List;

import com.scg.training.exception.InvalidInputException;
import com.scg.training.vo.StudentVO;

//@Service
//@Component
public interface StudentService {
	// String insert() throws Exception, InvalidInputException;

	String insert(StudentVO studentVO) throws Exception, InvalidInputException;

	String readById(int id) throws Exception;

	String update(StudentVO studentVO) throws Exception, InvalidInputException;

	StudentVO updateStudentById(StudentVO studentVO);

	String deleteStudent(int id);

	List<StudentVO> findByStudentName(String name);

	StudentVO getStudentById(int id);

	List<StudentVO> getStudentsByPagination(int pageNumber);

	List<StudentVO> getStudents();

	StudentVO saveStudent(StudentVO employeeVo);

}

//Field studentService in com.scg.training.controller.StudentController required a bean of type 'com.scg.training.service.StudentService' that could not be found.
