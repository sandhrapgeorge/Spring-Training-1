package com.scg.training.dao;

import java.util.List;

import com.scg.training.entity.Student;

//@Repository
public interface StudentDAO {

	Student saveStudent(Student student);

	List<Student> getStudents();

	List<Student> getStudentByName(String studentName);

	String deleteStudent(int id);

}
