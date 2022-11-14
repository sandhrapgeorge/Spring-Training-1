package com.scg.training.vo;

import lombok.Data;

@Data
public class LaptopVO {

	private int laptopId;
	private String laptopName;
	private StudentVO studentVO;

	public LaptopVO(final String laptopName, final StudentVO studentVO) {
		this.laptopName = laptopName;
		this.studentVO = studentVO;
	}

}
