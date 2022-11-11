package com.scg.training.vo;

import com.scg.training.entity.Student;

import lombok.Data;

@Data
public class LaptopVO {

	private int laptopId;
	private String laptopName;
	private Student student;

	public LaptopVO(final String laptopName, final Student student) {
		this.laptopName = laptopName;
		this.student = student;
	}

}
