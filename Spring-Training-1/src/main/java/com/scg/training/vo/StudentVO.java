package com.scg.training.vo;

import java.util.List;

import com.scg.training.entity.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentVO {
	private int id;
	private String studentName;
	private Gender gender;
	private StudentDetailsVO studentDetailsVO;
	private SchoolVO schoolVO;
	List<LaptopVO> laptopVO;

//	public StudentVO(final String studentName, final Gender gender, final StudentDetailsVO studentDetailsVO,
//			final SchoolVO schoolVO) {
//		this.studentName = studentName;
//		this.gender = gender;
//		this.studentDetailsVO = studentDetailsVO;
//		this.schoolVO = schoolVO;
//		this.laptopVO = laptopVO;
//	}

}
