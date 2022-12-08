package com.scg.training.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scg.training.entity.Contact;
import com.scg.training.entity.School;

//@Component
@Repository
public class SchoolTestRepository {
	@Autowired
	EntityManager entityManager;

//	@Transactional(dontRollbackOn = RuntimeException.class)
	@Transactional
	public void insert() {
		final Contact contact = new Contact();
		contact.setContactPersonName("paulhhiihhh");
		contact.setMobileNumber(9237890239L);
		for (int i = 1; i <= 10; ++i) {
			final School school = new School();
			// school.setContact(contact);
			school.setSchoolName("green vally" + i);
			school.setCity("nellikuzhi");
			entityManager.merge(school);
			System.out.println("data inserting to school table,i value" + i);
			if (i == 7) {
				throw new RuntimeException("an exception occured" + i);
			}
		}

	}
}

//Caused by: javax.persistence.TransactionRequiredException: No EntityManager with actual transaction available for current thread
//- cannot reliably process 'merge' call
//when you add  @Transactional  to a method, your code is wrapped in some Spring framework code, responsible for setting up
//a transaction and handling the commit/rollback depending on any thrown exceptions.
