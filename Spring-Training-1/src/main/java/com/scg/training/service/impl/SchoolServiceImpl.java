package com.scg.training.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scg.training.dao.SchoolDAO;
import com.scg.training.repository.SchoolRepository;
import com.scg.training.service.SchoolService;
import com.scg.training.vo.SchoolVO;

@Service
public class SchoolServiceImpl implements SchoolService {
	@Autowired
	private SchoolDAO schoolDao;
	@Autowired
	SchoolRepository schoolRepository;

//	@Override

	// @Transactional(isolation = Isolation.READ_COMMITTED)
//	public String saveSchool(final String city) {
//		// TODO Auto-generated method stub
//		final Contact contact = new Contact();
//		contact.setContactPersonName("paulhhiihhh");
//		contact.setMobileNumber(9237890239L);
//		for (int i = 1; i <= 10; ++i) {
//			final School school = new School();
//			school.setContact(contact);
//			school.setSchoolName("green vallyi" + i);
//			school.setCity("nellikuzhi");
//			schoolDao.saveSchool(school);
//			System.out.println("data inserting to school table,i value" + i);
//			if (i == 5) {
//				// throw new RuntimeException("an exception occured" + i);
//			}
//		}
//		return null;
//	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String saveSchool(final String city) throws InterruptedException {
//		final Callable<Void> callable1 = () -> {
//			trans1();
//			return null;
//		};
//
//		final Callable<Void> callable2 = () -> {
//			trans2();
//			return null;
//		};
//		System.out.println("inside service method");
//		final List<Callable<Void>> taskList = new ArrayList<>();
//		taskList.add(callable1);
//		taskList.add(callable2);
//		final ExecutorService executor = Executors.newFixedThreadPool(3);
//
//		// start the threads and wait for them to finish
//		executor.invokeAll(taskList);
//		} catch (final InterruptedException ie) {
//			// do something if you care about interruption;
//		}
//2nd way
//		final ExecutorService executor = Executors.newCachedThreadPool();
//
//		final Runnable callMultiply = this::trans1; // Create Runnable reference using lambda
//		executor.execute(callMultiply);
//		executor.execute(this::trans2); // inline
//
//		executor.shutdown();
//		return null;

		trans1();
		return null;
	}

	// @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor =
	// RuntimeException.class, isolation = Isolation.READ_UNCOMMITTED)
	// @Transactional
	private void trans1() {
		for (int i = 1; i <= 5; ++i) {
			schoolDao.update(i);
			if (i == 3) {
				// throw new RuntimeException("an exception occured" + i);
			}
		}

	}

	@Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_UNCOMMITTED)
	private void trans2() {
		schoolDao.readRecord();
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
	public SchoolVO getBySchoolName(final String name) {

		return schoolDao.getBySchoolName(name);
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

	@Override
	public List<SchoolVO> searchBySchoolName(final String name) {
		return schoolDao.searchBySchoolName(name);
	}

}
