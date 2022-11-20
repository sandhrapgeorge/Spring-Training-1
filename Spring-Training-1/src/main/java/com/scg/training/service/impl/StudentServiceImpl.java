package com.scg.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.training.dao.StudentDAO;
import com.scg.training.exception.InvalidInputException;
import com.scg.training.service.StudentService;
import com.scg.training.vo.StudentVO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDao;

	// @Transactional(propagation = Propagation.REQUIRED)
	@Override
	public StudentVO saveStudent(final StudentVO studentVO) throws Exception, InvalidInputException {
		// TODO Auto-generated method stub
		final String regex = "^[a-zA-Z]*$";
		if (!studentVO.getStudentName().matches(regex)) {
			throw new InvalidInputException("The given string is not a proper name");
		}
//		final String name=studentVO.getSchoolVO().getSchoolName();
//		if() {
		return studentDao.saveStudent(studentVO);
		// }
	}

	@Override
	public List<StudentVO> getStudents() {
		// TODO Auto-generated method stub
		return studentDao.getStudents();
	}

	@Override
	public List<StudentVO> getStudentByName(final String studentName) {
		// TODO Auto-generated method stub
		return studentDao.getStudentByName(studentName);
	}

	@Override
	public String deleteStudent(final int id) {
		// TODO Auto-generated method stub
		return studentDao.deleteStudent(id);
	}

//	@Override
//	public Student getStudentById(final int id) {
//		// TODO Auto-generated method stub
//		return studentDao.getStudentById(id);
//	}

}
//
//
//
//
//
//
//
//It means that Spring framework will autodetect these classes for dependency injection when annotation-based
//configuration and classpath scanning is used.

//@Component is a generic stereotype for any Spring-managed component.
//@Service annotates classes at the service layer.
//@Repository annotates classes at the persistence layer, which will act as a database repository.

//We mark beans with @Service to indicate that they're holding the business logic.
//Besides being used in the service layer, there isn't any other special use for this annotation.
//@Configuration annotation indicates that the class has @Bean definition methods
