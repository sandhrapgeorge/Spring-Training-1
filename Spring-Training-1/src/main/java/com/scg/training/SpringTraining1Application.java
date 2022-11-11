package com.scg.training;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.scg.training.entity.Address;
import com.scg.training.entity.Audit;
import com.scg.training.entity.Employee;
import com.scg.training.entity.Gender;
import com.scg.training.entity.Laptop;
import com.scg.training.entity.School;
import com.scg.training.entity.Student;
import com.scg.training.entity.StudentDetails;
import com.scg.training.repository.EmployeeRepository;
import com.scg.training.repository.StudentDetailsRepository;
import com.scg.training.repository.StudentRepository;

@SpringBootApplication
public class SpringTraining1Application {
//	@Autowired
//	private static StudentController studentController;

	public static void main(final String[] args) {
		// System.out.println("Hello");
		final ConfigurableApplicationContext context = SpringApplication.run(SpringTraining1Application.class, args);
//		System.out.println("Hii");
//		System.out.println(studentController.main2());

//		final StudentVO student = context.getBean(StudentVO.class);
//		System.out.println(student.getName());

		create(context);
		createEmployee(context);

//		final Student s1 = studentRepository.getById(1);
//		System.out.println(s1);

	}

	public static void create(final ConfigurableApplicationContext context) {
		try {

			final StudentRepository studentRepository = context.getBean(StudentRepository.class);
			final StudentDetailsRepository studentDetailsRepository = context.getBean(StudentDetailsRepository.class);
			final EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
			final StudentDetails studDetails = new StudentDetails("dance");
			studentDetailsRepository.save(studDetails);
			System.out.println("hii");
			final LocalDateTime now = LocalDateTime.now();
			final Address address = new Address(13, "snehavedu", "kothamangalam");
			final Student student1 = new Student("sini", studDetails, address);
			final Gender gender = Gender.FEMALE;
			student1.setGender(gender);
			student1.setCreatedAt(now);
			student1.setUpdatedAt(now);
			final Laptop laptop1 = new Laptop("DELL");
			final Laptop laptop2 = new Laptop("Lenovo");
			final List<Laptop> l1 = Arrays.asList(laptop1, laptop2);
			student1.setLaptop(l1);
			final School school1 = new School("MarBasil", "Kothamangalam");
			student1.setSchool(school1);
//		final StudentDetails studDetails2 = new StudentDetails("reading");
//		studentDetailsRepository.save(studDetails2);
//		final Student student2 = new Student("jini", studDetails2, address);
//		student2.setGender(gender);
//			student2.setCreatedAt(now);
//			student2.setUpdatedAt(now);
//		final Laptop laptop3 = new Laptop("Apple");
//		final Laptop laptop4 = new Laptop("Thoshiba");
//		final List<Laptop> l2 = Arrays.asList(laptop3, laptop4);
//		student2.setLaptop(l2);
//		student2.setSchool(school1);
			System.out.println("hello");

			studentRepository.save(student1);
			System.out.println("good...");
			// studentRepository
//		studentRepository.save(student2);

		} catch (final Exception e) {
			System.out.println("exception occured....");
			System.out.println(e);
		}

	}

	public static void createEmployee(final ApplicationContext context) {
		final EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		System.out.println("Hii..");
		final LocalDateTime now = LocalDateTime.now();
		final Audit audit = new Audit();
		audit.setCreatedTimestamp(now);
		audit.setLastUpdatedTimestamp(now);
		// final Employee employee = new Employee();
		audit.setCreatedBy("james");
		audit.setLastUpdatedBy("jiji");

		final Employee employee = new Employee("hancepaul", "HR", "1gl", audit);
//		employee.setEmployeeName("hancepaul");
//		employee.setDesignation("HR");
//		employee.setVersion("1gl");
//		final Audit audit = new Audit();
//		audit.setCreatedTimestamp(now);
//		audit.setLastUpdatedTimestamp(now);
//
//		audit.setCreatedBy("anu");
//		audit.setLastUpdatedBy("Mani");
//		employee.setAudit(audit);
		System.out.println("inserting..");
		try {

			employeeRepository.save(employee);
		} catch (final Exception e) {
			System.out.println("Exception :" + e);
		}

		System.out.println("inserting..");
	}

}
