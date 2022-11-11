package com.scg.training.vo;

import java.util.List;

import com.scg.training.entity.StudentDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {
	private int id;
	private String name;
	private StudentDetails studentDetails;
	List<LaptopVO> laptop;

	public StudentVO(final String name, final StudentDetails studentDetails, final List<LaptopVO> laptop) {
		this.name = name;
		this.studentDetails = studentDetails;
		this.laptop = laptop;
	}

}
