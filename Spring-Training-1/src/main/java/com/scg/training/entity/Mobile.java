package com.scg.training.entity;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//@Component("mobile")
@Component
public class Mobile implements Tools {

	private int mobileid;
	private String brand;

	@Override
	public void compile() {
		System.out.println("laptop compiling");

	}

}
