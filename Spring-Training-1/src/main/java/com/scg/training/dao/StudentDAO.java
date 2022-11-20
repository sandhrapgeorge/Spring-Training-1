package com.scg.training.dao;

import java.util.List;

import com.scg.training.vo.StudentVO;

//@Repository
public interface StudentDAO {

	StudentVO saveStudent(StudentVO student);

	List<StudentVO> getStudents();

	List<StudentVO> getStudentByName(String studentName);

	String deleteStudent(int id);

}
