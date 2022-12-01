package com.scg.training.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.training.dao.StudentDAO;
import com.scg.training.entity.Student;
import com.scg.training.mapper.StudentMapper;
import com.scg.training.repository.StudentRepository;
import com.scg.training.vo.StudentVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private StudentMapper studentMapper;

//	@Autowired
//	private LaptopMapper mapper2
	@Override
	// @Transactional(propagation = Propagation.REQUIRES_NEW, isolation =
	// Isolation.SERIALIZABLE)
	public StudentVO saveStudent(final StudentVO studentVO) {
		// final Student student1 =
		// Mappers.getMapper(StudentMapper.class).toEntity(studentVO);
		final Student student = studentMapper.toEntity(studentVO);
		// log.info("student laptop : " + student.getLaptop());
		final Student stud = studentRepository.save(student);
		final StudentVO studentVO1 = studentMapper.toVO(stud);
		// final StudentVO studentVO2 =
		// Mappers.getMapper(StudentMapper.class).toVO(student1);
		return studentVO1;

		// return studentRepository.save(studentVO);
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		// final List<Student> students = studentRepository.findAll();
		return studentMapper.toVOList(studentRepository.findAll());

		// return studentRepository.findAll();
		// return null;
	}

	@Override
	public List<StudentVO> getStudentByName(final String studentName) {
		// TODO Auto-generated method stub
		// return
		// StudentMapper.INSTANCE.toVOList(studentRepository.findStudentByName(studentName));
		return studentMapper.toVOList(studentRepository.findStudentByName(studentName));
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
