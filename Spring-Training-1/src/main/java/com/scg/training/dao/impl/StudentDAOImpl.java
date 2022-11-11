package com.scg.training.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.training.dao.StudentDAO;
import com.scg.training.entity.Student;
import com.scg.training.repository.StudentRepository;
import com.scg.training.vo.StudentVO;

@Component
//@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	StudentRepository studentRepo;

	// StudentController studentRepo=c.getBean(StudentRepository.class);
	private Student covertVoToEntity(final StudentVO studentVO) {
		final Student student = new Student();
		student.setStudentName(studentVO.getName());
		// student.setAge(studentVO.getAge());
		return student;

	}

	private StudentVO covertEntityToVO(final Student student) {
		final StudentVO studentVO = new StudentVO();
		studentVO.setId(student.getStudentid());
		studentVO.setName(student.getStudentName());
		// studentVO.setAge(student.getAge());
		return studentVO;

	}

	@Override
	public StudentVO insert(final StudentVO studentVO) throws Exception {
		// TODO Auto-generated method stub
		final Student savedStudent = studentRepo.save(covertVoToEntity(studentVO));// it used for saving the contents to
																					// // databse
		return (covertEntityToVO(savedStudent));
	}

	@Override
	public StudentVO readById(final int id) throws Exception {
//		// TODO Auto-generated method stub
		final Student readbystudent = studentRepo.getById(id);

		// final Student savedStudent = studentRepo.save(covertVoToEntity(studentVO));//
		// it used for saving the contents to
//																					// databse
		return (covertEntityToVO(readbystudent));
	}
//	}

	@SuppressWarnings("boxing")
	@Override
	public StudentVO update(final StudentVO studentVO) throws Exception {
		// TODO Auto-generated method stub
		if (!studentRepo.existsById(studentVO.getId())) {
			final Student savedStudent = studentRepo.save(covertVoToEntity(studentVO));
			return (covertEntityToVO(savedStudent));
		}
		final Student readbystudent = studentRepo.getById(studentVO.getId());
		readbystudent.setStudentName(studentVO.getName());
		// readbystudent.setAge(studentVO.getAge());
		final Student savedStudent = studentRepo.save(readbystudent);
		return (covertEntityToVO(savedStudent));

	}

	@Override
	public StudentVO updateStudentById(final StudentVO studentVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> findByStudentName(final String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO getStudentById(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> getStudentsByPagination(final int pageNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentVO saveStudent(final StudentVO studentVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
//Field studentDao in com.example.scg.service.impl.StudentServiceImpl required a bean of type 'com.scg.training.dao.StudentDAO' that could not be found.
