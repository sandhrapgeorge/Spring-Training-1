package com.scg.training;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.scg.training.entity.Audit;
import com.scg.training.entity.Gender;
import com.scg.training.entity.Laptop;
import com.scg.training.entity.School;
import com.scg.training.entity.Student;
import com.scg.training.entity.StudentDetails;
import com.scg.training.repository.StudentDetailsRepository;
import com.scg.training.repository.StudentRepository;

@SpringBootApplication
public class SpringTraining1Application {
//	@Autowired
//	private static StudentController studentController;

	public static void main(final String[] args) {

		final ConfigurableApplicationContext context = SpringApplication.run(SpringTraining1Application.class, args);
//
//		final Alien a1 = context.getBean(Alien.class);
//		a1.show();
		create(context);
		// createEmployee(context);

	}

	public static void create(final ConfigurableApplicationContext context) {
		try {

			final StudentRepository studentRepository = context.getBean(StudentRepository.class);
			final StudentDetailsRepository studentDetailsRepository = context.getBean(StudentDetailsRepository.class);

			final StudentDetails studDetails = new StudentDetails("dance");
			studentDetailsRepository.save(studDetails);
			System.out.println("hii");
			final LocalDateTime now = LocalDateTime.now();

			final Audit audit = new Audit();
			audit.setCreatedTimestamp(now);
			audit.setLastUpdatedTimestamp(now);
			audit.setCreatedBy("james");
			audit.setLastUpdatedBy("jiji");
			// final Address address = new Address(13, "snehavedu", "kothamangalam");
			final Student student1 = new Student("sini", studDetails, audit);
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
}