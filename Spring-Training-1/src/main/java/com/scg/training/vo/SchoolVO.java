package com.scg.training.vo;

import java.util.List;

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
	List<StudentVO> studentVO;

	public SchoolVO(final String schoolName, final String city, final List<StudentVO> studentVO) {
		this.schoolName = schoolName;
		this.city = city;
		this.studentVO = studentVO;
	}

}
