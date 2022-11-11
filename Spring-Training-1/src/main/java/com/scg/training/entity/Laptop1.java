package com.scg.training.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
//@Component("laptop")
@Component
@Primary
public class Laptop1 implements Tools {
	private int laptopid;
	private String brand;

	@Override
	public void compile() {
		System.out.println("laptop compiling");

	}

	public Laptop1() {
		System.out.println("laptop object is created");
	}
}
