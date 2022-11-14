package com.scg.training.vo;

import java.util.List;

import com.scg.training.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchoolVO {

	private int schoolid;
	private String schoolName;
	private String city;
	List<Student> student;

	public SchoolVO(final String schoolName, final String city, final List<Student> student) {
		this.schoolName = schoolName;
		this.city = city;
		this.student = student;
	}

}
