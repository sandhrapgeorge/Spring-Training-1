package com.scg.training.vo;

import lombok.Data;

@Data
public class StudentDetailsVO {

	private Integer id;
	private String hobby;
	private Double weight;

	public StudentDetailsVO(final String hobby, final Double weight) {
		this.hobby = hobby;
		this.weight = weight;
	}

}
