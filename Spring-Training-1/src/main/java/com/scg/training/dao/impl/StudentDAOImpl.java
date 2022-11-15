package com.scg.training.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.training.dao.StudentDAO;
import com.scg.training.entity.Student;
import com.scg.training.repository.StudentRepository;

@Component
//@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(final Student student) {
//		final Student student = StudentMapper.INSTANCE.toEntity(studentVO);
//		return StudentMapper.INSTANCE.toVO(studentRepository.save(student));

		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		// return StudentMapper.INSTANCE.toVOList(studentRepository.findAll());
		return studentRepository.findAll();
	}

	@Override
	public List<Student> getStudentByName(final String studentName) {
		// TODO Auto-generated method stub
		// return
		// StudentMapper.INSTANCE.toVOList(studentRepository.findStudentByName(studentName));
		return studentRepository.findStudentByName(studentName);
	}

	@Override
	public String deleteStudent(final int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student id : " + id + " Removed";
	}

//	@Override
//	public Student getStudentById(final int id) {
//		// TODO Auto-generated method stub
//		return studentRepository.findByStudentid(id);
//
//	}

}
//Field studentDao in com.example.scg.service.impl.StudentServiceImpl required a bean of type 'com.scg.training.dao.StudentDAO' that could not be found.
