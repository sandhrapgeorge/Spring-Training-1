package com.scg.training.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.training.dao.StudentDAO;
import com.scg.training.entity.Student;
import com.scg.training.mapper.StudentMapper;
import com.scg.training.repository.StudentRepository;
import com.scg.training.vo.StudentVO;

@Component
//@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentMapper studentMapper;
//	@Autowired
//	private LaptopMapper mapper2;

	@Override
	@Transactional
	public Student saveStudent(final Student student) {
//		final Student student = StudentMapper.INSTANCE.toEntity(studentVO);
//		return StudentMapper.INSTANCE.toVO(studentRepository.save(student));

		return studentRepository.save(student);
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		final List<Student> students = studentRepository.findAll();
		return studentMapper.toVOList(students);
		// return studentRepository.findAll();
		// return null;
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
