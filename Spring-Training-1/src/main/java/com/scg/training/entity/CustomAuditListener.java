package com.scg.training.entity;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Configuration
@Slf4j
public class CustomAuditListener {

	@PrePersist
	public void setCreatedOn(final Student stud) {
		log.info("Attempting to add new student" + stud.getStudentName());
		System.out.println("new user is adding to the datase" + stud.getStudentName());
//		final Audit audit = stud.getAudit();

		final LocalDateTime now = LocalDateTime.now();
		stud.setCreatedTimestamp(now);
		stud.setLastUpdatedTimestamp(now);

		stud.setCreatedBy("ani");
		stud.setLastUpdatedBy("vinu");
		System.out.println("data inserting on progress");

	}

	@PreUpdate
	public void setUpdadtedOn(final Student stud) {
		// final Audit audit = stud.getAudit();

		stud.setLastUpdatedTimestamp(LocalDateTime.now());
		stud.setLastUpdatedBy("abc");
		System.out.println("data inserting on progress");
	}

}
//@PrePersist
//public void saveAudit(final Employee employee) {
//	employee.setVersion("1GL");
//
//}
//
//@PostPersist
//public void setUpdadtedOn(final Employee employee) {
//
//	backup = new Audit(employee);
//	final LocalDateTime now = LocalDateTime.now();
//	backup.setCreatedTimestamp(now);
//	backup.setLastUpdatedTimestamp(now);
//
//	backup.setCreatedBy("sandhra");
//	backup.setLastUpdatedBy("system");
//	emprep.save(backup);
//
