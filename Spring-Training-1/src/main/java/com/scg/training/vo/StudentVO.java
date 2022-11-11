package com.scg.training.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {
	
	public StudentVO(String name2, int age2) {
		// TODO Auto-generated constructor stub
		this.name=name2;
		this.age=age2;
	}
	private int id;
	private String name;
	private int age;

}
