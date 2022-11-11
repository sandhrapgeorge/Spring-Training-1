package com.scg.training.entity;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable

public class Contact {

	private String contactPersonName;
	private String emailId;
	private Long mobileNumber;

}
