package com.scg.training.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class Audit {

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_timestamp")
	private LocalDateTime createdTimestamp;

	@Column(name = "last_updated_by")
	private String lastUpdatedBy;

	@Column(name = "last_updated_timestamp")
	private LocalDateTime lastUpdatedTimestamp;

//	public Audit(final Employee employee) {
//		this.employeeName = employee.getEmployeeName();
//		this.designation = employee.getDesignation();
//		this.version = employee.getVersion();
//	}

}
