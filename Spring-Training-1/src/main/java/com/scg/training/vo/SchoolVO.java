package com.scg.training.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SchoolVO {

	private int schoolid;
	private String schoolName;
	private String city;

	// List<StudentVO> studentVO;

//	public SchoolVO(final String schoolName, final String city) {
//		this.schoolName = schoolName;
//		this.city = city;
//		// this.studentVO = studentVO;
//	}

}
