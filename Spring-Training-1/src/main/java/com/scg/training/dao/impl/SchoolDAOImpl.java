package com.scg.training.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scg.training.dao.SchoolDAO;
import com.scg.training.entity.Contact;
import com.scg.training.entity.School;
import com.scg.training.entity.School_;
import com.scg.training.mapper.SchoolMapper;
import com.scg.training.repository.SchoolRepository;
import com.scg.training.vo.SchoolVO;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SchoolDAOImpl implements SchoolDAO {
	@Autowired
	private SchoolRepository schoolRepository;
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String saveSchool(final School school) {
		// TODO Auto-generated method stub
		schoolRepository.save(school);
		if (school.getSchoolName().equals("green vallyi5")) {
			final Contact contact = new Contact();
			contact.setContactPersonName("basil");
			contact.setMobileNumber(9995995182L);
			for (int j = 5; j <= 7; ++j) {
				final School school1 = new School();
				school1.setContact(contact);
				school1.setSchoolName("Mar basilj" + j);
				school1.setCity("Kothamangalam");
				schoolRepository.save(school1);
				System.out.println("data inserting to school table,i value" + j);
				if (j == 6) {
					// throw new RuntimeException("an exception occured" + i);
				}
			}
		}
		return null;
	}

	@Override
	// @Transactional(propagation = Propagation)
	// @Transactional(propagation = Propagation.SUPPORTS)
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void update(final int i) {
		System.out.println("hi.. inside update method\n");
		final Optional<School> savedRecord = schoolRepository.findById(i);
		if (savedRecord.isPresent()) {
			savedRecord.get().setCity("punjab...");
			savedRecord.get().setSchoolName("ST.George)" + i);
			System.out.println("Updating values-inside i loop:" + i);
			schoolRepository.save(savedRecord.get());
			if (i == 2) {
				for (int j = 6; j <= 13; ++j) {
					final Optional<School> savedRecord1 = schoolRepository.findById(j);
					if (savedRecord1.isPresent()) {
						savedRecord1.get().setCity("thamilnadu..");
						savedRecord1.get().setSchoolName("mar basil " + j);
						System.out.println("Updating values -inside j loop:" + j);
						if (j == 6) {
							readRecord();
						}
						schoolRepository.save(savedRecord1.get());
						if (j == 7) {

							// throw new RuntimeException("an exception occured" + j);
						}
					}
				}
			}
		}

	}

	@Override
	// @Transactional(propagation = Propagation.REQUIRES_NEW)
	public void readRecord() {
		final int id = 6;
		final Optional<School> savedRecord = schoolRepository.findById(id);

		if (savedRecord.isPresent()) {
			final String str = "school name :" + savedRecord.get().getSchoolName() + "\ncity name: "
					+ savedRecord.get().getCity();
			System.out.println("Reading the values");
			System.out.println(str);
			savedRecord.get().setCity("megalaya..");
			schoolRepository.save(savedRecord.get());
		}
	}

	@Override
	public SchoolVO getBySchoolName(final String name) {

		final School school = schoolRepository.findBySchoolName(name);

		return schoolMapper.toVO(school);

	}

	@Override
	public List<SchoolVO> searchBySchoolName(final String name) {
//		final List<School> school = schoolRepository.searchSchoolByName(name);
//		final Specification<School> spec = new Specification<School>() {
//
//			@Override
//			public Predicate toPredicate(Root<School> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//
//		}
		final List<School> schoolList = schoolRepository.findAll(likeSchoolName(name).and(likeCity("hari")));
		return schoolMapper.toVOList(schoolList);
		// return null;
	}

	public static Specification<School> likeSchoolName(final String studentName) {
		if (studentName == null) {
			return null;
		}
		return (root, query, cb) -> cb.like(root.get(School_.Name), "%" + studentName + "%");
	}

	public static Specification<School> likeCity(final String city) {
		if (city == null) {
			return null;
		}
		return (root, query, cb) -> cb.like(root.get(School_.City), "%" + city + "%");
	}

}
