package com.scg.training.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scg.training.dao.SchoolDAO;
import com.scg.training.entity.Contact;
import com.scg.training.entity.School;
import com.scg.training.repository.SchoolRepository;

@Component
public class SchoolDAOImpl implements SchoolDAO {
	@Autowired
	SchoolRepository schoolRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public String saveSchool(final School school) {
		// TODO Auto-generated method stub
		schoolRepository.save(school);
		if (school.getSchoolName().equals("green vally5")) {
			final Contact contact = new Contact();
			contact.setContactPersonName("basil");
			contact.setMobileNumber(9995995182L);
			for (int i = 5; i <= 7; ++i) {
				final School school1 = new School();
				school1.setContact(contact);
				school1.setSchoolName("Mar basil" + 5);
				school1.setCity("Kothamangalam");
				schoolRepository.save(school1);
				System.out.println("data inserting to school table,i value" + i);
				if (i == 6) {
					// throw new RuntimeException("an exception occured" + i);
				}
			}
		}
		return null;
	}

}
