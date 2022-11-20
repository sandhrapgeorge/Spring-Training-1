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
public class LaptopVO {

	private int laptopId;
	private String laptopName;
	// private StudentVO studentVO;

	public LaptopVO(final String laptopName) {
		this.laptopName = laptopName;
		// this.studentVO = studentVO;
	}

}
