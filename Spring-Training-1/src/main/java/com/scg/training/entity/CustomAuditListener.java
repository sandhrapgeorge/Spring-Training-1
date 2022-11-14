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
	public void setCreatedOn(final Student student) {
		log.info("Attempting to add new student" + student.getStudentName());
		System.out.println("new user is adding to the datase" + student.getStudentName());
		// final Audit audit = stud.getAudit();

		final LocalDateTime now = LocalDateTime.now();

		student.setCreatedTimestamp(now);
		student.setLastUpdatedTimestamp(now);

		student.setCreatedBy("ani");
		student.setLastUpdatedBy("vinu");
		System.out.println("data inserting on progress");

	}

	@PreUpdate
	public void setUpdadtedOn(final Student student) {
		// final Audit audit = stud.getAudit();

		student.setLastUpdatedTimestamp(LocalDateTime.now());
		student.setLastUpdatedBy("abc");
		System.out.println("data inserting on progress");
	}

}
