package com.scg.training.dao;

import java.util.List;

import com.scg.training.vo.StudentVO;

//@Repository
public interface StudentDAO {

	StudentVO insert(StudentVO studentVO) throws Exception;

	StudentVO readById(int id) throws Exception;

	StudentVO update(StudentVO studentVO) throws Exception;

	StudentVO updateStudentById(StudentVO studentVO);

	String deleteStudent(int id);

	List<StudentVO> findByStudentName(String name);

	StudentVO getStudentById(int id);

	List<StudentVO> getStudentsByPagination(int pageNumber);

	List<StudentVO> getStudents();

	StudentVO saveStudent(StudentVO studentVO);

}
