package com.scg.training.dao;

import java.util.List;

import com.scg.training.entity.Student;
import com.scg.training.vo.StudentVO;

//@Repository
public interface StudentDAO {

	Student saveStudent(Student student);

	List<StudentVO> getStudents();

	List<Student> getStudentByName(String studentName);

	String deleteStudent(int id);

}
