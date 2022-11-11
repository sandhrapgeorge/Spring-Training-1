package com.scg.training.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.training.dao.StudentDAO;
import com.scg.training.exception.InvalidInputException;
import com.scg.training.service.StudentService;
import com.scg.training.vo.StudentVO;

//@Service
@Component
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDao;
	final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private int readInteger() throws Exception {
		final int i = Integer.parseInt(br.readLine());
		return i;
	}

	private String readString() throws Exception {
		final String s = br.readLine();
		return s;
	}

	@Override
	public String insert(final StudentVO studentVO) throws Exception, InvalidInputException {
		// TODO Auto-generated method stub

		// System.out.println("Enter Name and Age of the student");
		// final String name = readString();
		final String regex = "^[a-zA-Z]*$";
		if (!studentVO.getName().matches(regex)) {
			throw new InvalidInputException("The given string is not a proper name");
		}
		// final int age = readInteger();

		if ((studentVO.getAge() < 6) || (studentVO.getAge() > 50)) {
			throw new InvalidInputException("Invalid student Age");
		}

		final StudentVO savedStudent = studentDao.insert(studentVO);
		System.out.println("Student record inserted successfuly\n");
		return ("Student record inserted successfuly\n Studentid : " + savedStudent.getId());

	}

	@Override
	public String readById(final int id) throws Exception {
		final StudentVO savedStudent = studentDao.readById(id);
		return ("Student details are :\n Student id :" + savedStudent.getId() + "\nStudent name: "
				+ savedStudent.getName() + "\nStudent Age: " + savedStudent.getAge());

	}

	@Override
	public String update(final StudentVO studentVO) throws Exception, InvalidInputException {
		// TODO Auto-generated method stub

		final String regex = "^[a-zA-Z]*$";
		if (!studentVO.getName().matches(regex)) {
			throw new InvalidInputException("The given string is not a proper name");
		}
		// final int age = readInteger();

		if ((studentVO.getAge() < 6) || (studentVO.getAge() > 50)) {
			throw new InvalidInputException("Invalid student Age");
		}

		final StudentVO savedStudent = studentDao.update(studentVO);
		System.out.println("Student record updated successfuly\n");
		return ("Student record updated successfuly\nStudentid : " + savedStudent.getId() + "\nstudent name :"
				+ savedStudent.getName() + "\nstudent age: " + savedStudent.getAge());

	}
}
//
//				try {
//
//					System.out.println("Enter the Name");
//					final String name = StudService.readString();
//					final Student stud = studentDAO.readByName(name);
//					display(stud);
//				} catch (final Exception e) {
//					System.out.println(e.getMessage());
//				}
//			}
//}
//		} catch (final Exception e) {
//			System.out.println(e.getMessage());
//			return ("Invalid input- insert" + e);
//		}
//		return "inserted";
// }
//	public static void searchByName() throws Exception {
//
//		//try {
//
//			System.out.println("Enter the name to search");
//			final String name =readString();
//			final List<Student> studentList = studentDAO.searchByName(name);
//			if (studentList.isEmpty()) {
//				System.out.println("No data record found");
//				return;
//			}
//
//			for (final Student stud : studentList) {
//				display(stud);
//			}
//			System.out.println();
//		} catch (final Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//
//	public static void readByName() {
//
//		try {
//
//			System.out.println("Enter the Name");
//			final String name = StudService.readString();
//			final Student stud = studentDAO.readByName(name);
//			display(stud);
//		} catch (final Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//}

//It means that Spring framework will autodetect these classes for dependency injection when annotation-based
//configuration and classpath scanning is used.

//@Component is a generic stereotype for any Spring-managed component.
//@Service annotates classes at the service layer.
//@Repository annotates classes at the persistence layer, which will act as a database repository.

//We mark beans with @Service to indicate that they're holding the business logic.
//Besides being used in the service layer, there isn't any other special use for this annotation.
//@Configuration annotation indicates that the class has @Bean definition methods
