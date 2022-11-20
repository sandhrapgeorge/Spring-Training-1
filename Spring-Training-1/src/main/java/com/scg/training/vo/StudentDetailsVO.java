package com.scg.training.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentDetailsVO {

	private Integer id;
	private String hobby;
	private Double weight;

	public StudentDetailsVO(final String hobby, final Double weight) {
		this.hobby = hobby;
		this.weight = weight;
	}

}
