package com.scg.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scg.training.dao.SchoolDAO;
import com.scg.training.entity.Contact;
import com.scg.training.entity.School;
import com.scg.training.service.SchoolService;
import com.scg.training.vo.SchoolVO;

@Service
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolDAO schoolDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String saveSchool(final String city) {
		// TODO Auto-generated method stub
		final Contact contact = new Contact();
		contact.setContactPersonName("paulhhiihhh");
		contact.setMobileNumber(9237890239L);
		for (int i = 1; i <= 10; ++i) {
			final School school = new School();
			school.setContact(contact);
			school.setSchoolName("green vally" + i);
			school.setCity("nellikuzhi");
			schoolDao.saveSchool(school);
			System.out.println("data inserting to school table,i value" + i);
			if (i == 5) {
				// throw new RuntimeException("an exception occured" + i);
			}
		}
		return null;
	}

	@Override
	public List<SchoolVO> getSchool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolVO getSchoolById(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolVO findBySchoolName(final String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteSchool(final int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SchoolVO updateShoolById(final SchoolVO SchoolVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
