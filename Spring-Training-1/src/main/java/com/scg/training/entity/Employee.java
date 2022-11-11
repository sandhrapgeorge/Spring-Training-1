package com.scg.training.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EntityListeners(CustomAuditListener.class)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeid;
	private String employeeName;
	private String Designation;
	private String version;
	@Embedded
	private Audit audit;

	public Employee(final String employeeName, final String designation, final String version, final Audit audit) {
		this.employeeName = employeeName;
		Designation = designation;
		this.version = version;
		this.audit = audit;
	}

}
